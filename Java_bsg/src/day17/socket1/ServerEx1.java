package day17.socket1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class ServerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port =5001;
		
		ServerSocket serverSocket = null;
		String fileName="src/day17.socket";
		ArrayList<String>list=new ArrayList<>();
		list=load(fileName);
		try {
			serverSocket=new ServerSocket(port);
			
			
			Socket socket=serverSocket.accept();
			System.out.println("[연결 성공]");
			OutputStream os=socket.getOutputStream();
			ObjectOutputStream oos=ObjectOutputStream(socket.getOutputStream(os));
			oos.writeObject(list);
			while(true){
				String str=ois.readUTF();
				
				if(str.equals("-1")) {
					break;}	
				System.out.println(str);
				list.add(str);
			}
				ois.close();
				is.close();
				
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		save(list,fileName);
	}

	private static void save(ArrayList<String> list, String fileName) {
		// TODO Auto-generated method stub
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
			list.stream().forEach(str->{
				try {oos.writeUTF(str);
			}catch(IOException e) {
				e.printStackTrace();
			}});
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		private static ArrayList<String> load(String fileName){
			ArrayList<String>list=new ArrayList<String>();
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
				while(true) {
					list.add(ois.readUTF());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
	}


