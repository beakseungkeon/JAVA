package day13;

import java.util.Scanner;

import day09.board.board;

public class StringEx2 {
	static int menu;
	static Scanner scan = new Scanner(System.in);
	static int count=0;
	static String[] str=new String[5];
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*문장들을 입력받아 배열에 저장하고,특정 단어가 들어가 있는 
		 * 문장들을 출력하는 프로그램을 작성하세요
		 * 메뉴
		 * 1.문장 추가
		 * 2.검색
		 * 3.종료
		 * */
		
		/*
		 *안녕하세요.
		 *테스트
		 *만나서 반갑습니다.
		 *나는 홍길동입니다.
		 *나로 검색
		 *만나서 반갑습니다.
		 *나는 홍길동입니다.
		 * */
		printMenu();
		runMenu();
	}
	
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1.문장 추가");
		System.out.println("2.검색");
		System.out.println("3.종료");
		System.out.println("메뉴선택:");
	}
	public static void runMenu() {
		do {	
			menu=scan.nextInt();
		switch(menu) {
		case 1:
			addString();
			break;
		case 2:
			serchString();
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
			
			
		}while(menu!=3);System.out.println("프로그램 종료");
	}
	public static void addString() {
		
		System.out.println("추가할 문장");
		scan.nextLine();
		String str1=scan.nextLine();
		str[count]=str1;
		count++;
		
		
	}
	public static void serchString() {
		System.out.println("검색할 문장:");
		String serch=scan.nextLine();
		for(int i=0;i<str.length;i++) {
			if(str[i].contains(serch)) {
				System.out.println(str[i]);
			}
		}
	}
}
