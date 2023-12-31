package day17.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import program.program;

public class StudentProgram implements program {

	private StudentManager sm=new StudentManager();
	private Scanner scan = new Scanner(System.in);
	private final int EXIT=3;
	@Override
	public void run() {
		int menu=0;
		String fileName="src/day17/student/student.txt";
		do {
			//불러오기
			load(fileName);
			//메뉴 출력
			printMenu();
			try {
			//메뉴 선택
			menu=scan.nextInt();
			//메뉴 실행
			runMenu(menu);
			}catch (InputMismatchException e) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				scan.nextLine();
			}
		}while(menu!=EXIT);
		//저장
		save(fileName);
	}

	private void save(String fileName) {
		// TODO Auto-generated method stub
		
				try(FileOutputStream fos =new FileOutputStream(fileName);
						ObjectOutputStream oos=new ObjectOutputStream(fos)){
						//sm에 @Data해야함
						oos.writeObject(sm.getList());
					} catch (FileNotFoundException e) {
						//폴더 경로가 잘못된 경우
						System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
						
					} catch (IOException e) {
						System.out.println("저장에 실패했습니다.");
					}
	}
	private void load(String fileName) {
		// 서버에서 학생 정보를 불러옴
		try(FileInputStream fis =new FileInputStream(fileName);
				ObjectInputStream ois=new ObjectInputStream(fis)){
				try {
					sm.setList((ArrayList<Student>)ois.readObject());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				//폴더 경로가 잘못된 경우
				System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
				
			} catch (IOException e) {
				System.out.println("불러오기에 실패했습니다.");
			}
	}

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("======메뉴======");
		System.out.println("1.학생 추가");
		System.out.println("2.학생 조회[전체]");
		System.out.println("3.종료");
		System.out.println("---------------");
		System.out.println("메뉴선택:");
	}

	@Override
	public void runMenu(int menu) {
		// TODO Auto-generated method stub
		switch(menu) {
		case 1:
			insertStudent();
			break;
		case 2:
			sm.printAll();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void insertStudent() {
		// TODO Auto-generated method stub
		//학생 정보 입력
		System.out.println("학년: ");
		int grade=scan.nextInt();
		System.out.println("반: ");
		int classNum=scan.nextInt();
		System.out.println("번호: ");
		int num=scan.nextInt();
		System.out.println("이름: ");
		String name=scan.next();
		//학생 객체 생성
		Student std=new Student(grade, classNum, num, name);
		
		//추가를 해서 성공하면 성공 알림,실패하면 실패 알림
			if(sm.insertStudent(std)) {
				System.out.println("학생을 추가했습니다.");
				return ;
			}
			System.out.println("이미 등록된 학생입니다.");
	}

}
