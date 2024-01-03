package day17.socket1;

import java.io.IOException;
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
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list=null;
		//1. ip와 port를 이용해 소켓 생성 및 대기
	try(Socket socket = new Socket()){
		socket.connect(new InetSocketAddress(ip,port));
		System.out.println("연결성공");
		OutputStream os=socket.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);
		
		
		System.out.println(list);
		while(true){
		System.out.println("내용:");
		String str=scan.nextLine();
		oos.writeUTF(str);
		oos.flush();
		if(str.equals("-1")) {
			break;}	
		list.add(str);
		}
		oos.close();
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
