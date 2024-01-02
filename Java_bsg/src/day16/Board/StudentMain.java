package day16.Board;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	static Scanner scan = new Scanner(System.in);
	static List<Student> list=new ArrayList<Student>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0;
		String fileName="src/day16/Board/list.txt";
		load(fileName);
		do {
			try {
			printMenu();
			menu=scan.nextInt();
			runMenu(menu);
			}catch(Exception e) {
				System.out.println("예외가 발생했습니다.");
			}
			
		}while(menu!=3);
		save(fileName);
	}
	private static void runMenu(int menu) {
		// TODO Auto-generated method stub
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			printStudent();
			break;
		case 3:
			System.out.println("프로그램을 종료 합니다.");
			break;
		default:
			throw new RuntimeException();
		}
	}
	private static void printStudent() {
		list.stream().forEach(s->System.out.println(s));
	}
	private static void insertStudent() {
		//학년,반,번호,이름 입력
		System.out.println("학년: ");
		int grade=scan.nextInt();
		System.out.println("반: ");
		int classNum=scan.nextInt();
		System.out.println("번호: ");
		int num=scan.nextInt();
		System.out.println("이름: ");
		String name=scan.next();
		//객체 생성
		Student std=new Student(grade,classNum,num,name);
		//같은 학생이 있는지 확인하고
		if(!list.contains(std)) {
			//없으면 학생 추가
			list.add(std);
			System.out.println("학생을 추가했습니다.");
		}
		//있으면 안내 문구
		System.out.println("등록된 학생입니다.");
	}
	private static void save(String fileName) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos=new FileOutputStream(fileName);
			ObjectOutputStream oos= new ObjectOutputStream(fos)){
			oos.writeObject(list);
		} catch (IOException e) {
			System.out.println("불러오기에 실패했습니다.");
		}
	}
	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("======메뉴======");
		System.out.println("1.학생 추가");
		System.out.println("2.학생 조회[전체]");
		System.out.println("3.종료");
		System.out.println("---------------");
		System.out.println("메뉴선택:");
		
	}
	private static void load(String fileName) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois= new ObjectInputStream(fis)){
			try {
				list=(List<Student>)ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("학생 정보를 불러왔습니다.");
		} catch (IOException e) {
			System.out.println("불러오기에 실패했습니다.");
			
		}
	}

}
