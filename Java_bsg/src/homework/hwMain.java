package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hwMain {
	static Scanner scan = new Scanner(System.in);
	static List<word> list=new ArrayList<word>();
	public static void main(String[] args) {
		/* 영어 단어장을 관리하는 프로그램을 작성하세요.
		 * - 한 단어에 뜻이 여러개 있을 수 있음
		 * - 단어, 품사, 뜻을 관리
		 * - 단어 추가
		 * - 단어 수정
		 * - 단어 삭제
		 * - 뜻 추가
		 * - 뜻 수정
		 * - 뜻 삭제
		 * - 단어 조회
		 * 
		 * - 기타 추가 기능을 구현해도 됨
		 * - 등록된 단어장에서 랜덤으로 문제가 나오고 맞추는 기능
		 * - 오답 노트를 관리하는 기능 
		 * - 많이 조회한 단어를 확인하는 기능
		 * */
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
			
		}while(menu!=8);
		save(fileName);
	}

	private static void save(String fileName) {
		// TODO Auto-generated method stub
		
	}

	private static void runMenu(int menu) {
		// TODO Auto-generated method stub
		switch(menu) {
		case 1:
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
			break;
		case 8:
			break;
		default:System.out.println("잘못된 입력");
		}
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("-------메뉴-------"); 
		System.out.println("1.단어 추가"); 
		System.out.println("2.단어 수정"); 
		System.out.println("3.단어 삭제"); 
		System.out.println("4.뜻 추가"); 
		System.out.println("5.뜻 수정");
		System.out.println("6.뜻 삭제"); 
		System.out.println("7.단어 조회"); 
		System.out.println("메뉴 선택:"); 
		
	}

	private static void load(String fileName) {
		// TODO Auto-generated method stub
		
	}

	}


