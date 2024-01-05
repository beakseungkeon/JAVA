package day18.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


public class ServerEx1 {
	private static List<Student>list;
	private static String fileName="src/dat18/Student/list.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port =5001;
		load();
		System.out.println(list);
		try(ServerSocket serverSocket = new ServerSocket(port)){
			
			while(true) {
			
				Thread t = new ServerThread(serverSocket.accept(),list);
					
				
				t.start();
				save();
			}
		} catch (Exception e) {
			System.out.println("서버 소켓 생성에서 예외가 발생하여 종료합니다.");
		}
		
	}
	private static void save() {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream foos=
					new ObjectOutputStream(new FileOutputStream(fileName));
			foos.writeObject(list);
			foos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void load() {
		// TODO Auto-generated method stub
		
	
		try {
			ObjectInputStream fois=
					new ObjectInputStream(new FileInputStream(fileName));
			list=(List<Student>)fois.readObject();
			
		} catch (IOException |ClassNotFoundException e) {
			// TODO Auto-generated catch block
			list=new ArrayList<Student>();
			e.printStackTrace();
		}
		
	}
	
	private static Thread ServerThread(Socket accept) {
		// TODO Auto-generated method stub
		return null;
	}

}
@RequiredArgsConstructor
class ServerThread extends Thread{
	@NonNull
	List<Student>list;
	@NonNull
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public void run() {
		try {
			 ois =new ObjectInputStream(socket.getInputStream());
			 oos=new ObjectOutputStream(socket.getOutputStream());
			String menu = ois.readUTF();
			switch(menu) {
			case"LOAD":
				load();
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private  void load() {
		// TODO Auto-generated method stub
		
		try {
			oos.writeObject(list);
			oos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ServerThread(Socket accept, List<Student> list2) {
		// TODO Auto-generated constructor stub
	}
	
}