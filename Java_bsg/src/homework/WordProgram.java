package homework;

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

public class WordProgram implements program{
	private WordManager wm=new WordManager();
	private Scanner scan = new Scanner(System.in);
	private final int EXIT=8;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int menu=0;
		String fileName="src/homework/word.txt";
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
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(wm.getList());
				System.out.println("저장하기를 성공 했습니다.");
			} catch (FileNotFoundException e) {
				//폴더 경로가 잘 못된 경우
				System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
			} catch (IOException e) {
				System.out.println("저장에 실패 했습니다.");
			}
	}
	private void load(String fileName) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
				wm.setList((ArrayList<Word>)ois.readObject());
				System.out.println("불러오기를 성공 했습니다.");
			} catch (FileNotFoundException e) {
				//폴더 경로가 잘 못된 경우
				System.out.println("지정된 위치에 파일을 찾을 수 없습니다.");
			} catch (Exception e) {
				System.out.println("불러오기에 실패 했습니다.");
			}
	}
	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("======메뉴======");
		System.out.println("1.단어 추가");
		System.out.println("2.단어 수정");
		System.out.println("3.단어 삭제");
		System.out.println("4.뜻 추가");
		System.out.println("5.뜻 수정");
		System.out.println("6.뜻 삭제");
		System.out.println("7.단어 조회");
		System.out.println("8.프로그램 종료");
		System.out.println("------------------");
		System.out.println("메뉴선택:");
	}
	@Override
	public void runMenu(int menu) {
		// TODO Auto-generated method stub
		switch(menu) {
		case 1:
			insertWord();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			wm.printAll();
			break;
		case 8: 
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			throw new InputMismatchException();
		}
	}
	private void insertWord() {
		// TODO Auto-generated method stub
		scan.nextLine();
		System.out.print("단어 : ");
		String Word = scan.nextLine();
		
		System.out.print("품사  : ");
		String WordClass = scan.nextLine();
		System.out.print("뜻 : ");
		 String mean = scan.nextLine();
		
		//학생 객체 생성
		Word word = new Word(Word, WordClass, mean);
		//추가를 해서 성공하면 성공 알림, 실패하면 실패 알림
		if(wm.insertWord(word)) {
			System.out.println("단어를 추가 했습니다.");
			return;
		}
		System.out.println("이미 등록된 단어입니다.");
	}
	
	
	
	
	
	
	
	
	
}
