package day16.Board;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;





public class BoardMain {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 다음 기능을 가진 프로그램을 만드세요
		 * 학생 관리 프로그램
		 * 기능
		 * 1.학생추가
		 * 2.학생 조회
		 * 3.종료
		 * 학생은 학년,반,이름을 가진다.
		 * 저장 기능과 불러오기 기능을 통해 학생 정보를 유지
		 * */
		int menu=0;
		String fileName = "src/day16/Board/Student.txt";
		do {
			System.out.println("메뉴 선택");
			System.out.println("1.학생 추가");
			System.out.println("2.학생 조회");
			System.out.println("3.종료");
			menu=scan.nextInt();
			switch(menu) {
			case 1: System.out.println("학생 입력: 학년,반,번호,이름");
			 int grade=scan.nextInt();
			 int classNum=scan.nextInt();
			 int num=scan.nextInt();
			 String name=scan.nextLine();
			 
			
			Student std = new Student(grade,classNum,num,name);
			
			//게시글을 파일에 저장
			try(FileOutputStream fos= new FileOutputStream(fileName);
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
					oos.writeObject(std);
				}
			catch (FileNotFoundException e) {
				System.out.println("파일을 찾지 못했습니다.");
				
			} catch (IOException e) {
				System.out.println("파일을 쓰는 도중에 예외 발생");
				}break;
			case 2:
				try(FileInputStream fis= new FileInputStream(fileName);
					ObjectInputStream ois=new ObjectInputStream(fis)){
					Student tmp=(Student)ois.readObject();
					System.out.println(tmp);
						} catch (ClassNotFoundException e) {
							System.out.println("클래스를 찾지 못했습니다.");
							
						} catch (IOException e) {
							System.out.println("파일을 읽는 중에 문제가 발생했습니다.");
			
						}break;
			case 3:System.out.println("프로그램 종료");break;
			default :System.out.println("잘못된 입력");
			}
			
		}while(menu!=3);
		
		
		
	}

}
@Data
@AllArgsConstructor
class Student implements Serializable{
	/*같은 클래스이어도 serialVersionId가 다르면 읽어오지 못함
	 * */
	private static final long serialVersionUID = 4586889365887406687L;
	int Grade,classNum,num;
	String name;
	
	
}
