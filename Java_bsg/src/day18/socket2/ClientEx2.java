package day18.socket2;


import java.net.Socket;

public class ClientEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port =5001;
		String ip="192.168.30.199";
		try {
			Socket socket=new Socket(ip,port);
			Client client = new Client(socket);
			client.send();
			client.recevie();
		} catch (Exception e) {
			System.out.println("예외가 발생하여 종료합니다.");
		}
	}

}
