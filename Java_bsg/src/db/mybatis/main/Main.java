package db.mybatis.main;

import java.util.Scanner;

import db.mybatis.controller.MemberController;
import lombok.Builder.Default;

public class Main {
	private static MemberController memberController=new MemberController();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		Scanner scan = new Scanner(System.in);
		
		do {
			printMenu();
			menu=scan.nextInt();
			runMenu(menu);
		}while(menu !=2);
	}

	private static void runMenu(int menu) {
		
		switch(menu) {
		case 1:
			memberController.run();
			break;
		case 2:
			System.out.println("프로그램을 종료합니다.");
		default:
			System.out.println("잘못된 메뉴입니다.");
		}		
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("메뉴");
		System.out.println("1. 회원 관리");
		System.out.println("2. 프로그램종료");
		
		System.out.println("메뉴 선택: ");
	}

}
