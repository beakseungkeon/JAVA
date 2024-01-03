package day17.socket2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip="192.168.30.209";
		int port = 5001;
		
		
		//1. ip와 port를 이용해 소켓 생성 및 대기
		Socket socket;
	try{
		socket=new Socket(ip,port);
		System.out.println("연결성공");
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
			System.out.println("클라이언트 : 받는 기능 종료");
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
			System.out.println("클라이언트: 보내는 기능 종료");
		});
		sendthread.start();
		
	} catch (UnknownHostException e) {
		System.out.println("연결할 수 없습니다.");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println();
	}
	

}
