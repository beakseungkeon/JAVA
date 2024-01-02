package day16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/day16/charStreamEx1.txt";
		try(
				FileWriter fw= new FileWriter(fileName);
				FileReader fr= new FileReader(fileName);	){
			String str="안녕하세요";
			for(int i=0;i<str.length();i++) {
				fw.write(str.charAt(i));
			}
			char [] arr=new char[20];
			fr.read(arr);
			System.out.println(arr);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			
		} catch (IOException e) {
			System.out.println("파일 작업 중 예외가 발생했습니다.");
		}
	}

}
