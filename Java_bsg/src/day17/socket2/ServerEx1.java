package day17.socket2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class ServerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port =5001;
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket=new ServerSocket(port);
			
			
			Socket socket=serverSocket.accept();
			System.out.println("[연결 성공]");
			//클라이언트가 보낸 문자열을 읽어와서 콘솔에 출력하는 쓰레드
			Thread receiveThread=new Thread(()->{
				try {
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
					while(true) {
					String str=ois.readUTF();
					if(str.equals("-1")) {
						break;
					}
					System.out.println(str);
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("서버 : 받는 기능 종료");
			});
			receiveThread.start();
			//문자열을 입력받아 클라이언트에 전송하는 쓰레드
			Thread sendthread =new Thread(()-> {
				try{
					ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
					Scanner scan=new Scanner(System.in);
					while(true) {
						String str=scan.nextLine();
						oos.writeUTF(str);
						oos.flush();
						if(str.equals("-1")) {
							break;
						}
					}
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				System.out.println("서버: 보내는 기능 종료");
			});
			sendthread.start();
			} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("서버 : 메인 기능 종료");
	}
			
}


