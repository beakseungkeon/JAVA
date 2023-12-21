package day10.word;

import java.util.Scanner;

public class WordMaint {
	/*1.기능 정리
	 * 영어 단어는 영어단어와 한글 뜻으로 구성
	 * 영어 단어는 영어이고,공백이 없는 단어
	 * 한글 뜻은 한글이고, 한 문장으로 되어 있다
	 * 한 단어에 뜻이 한개만 있다고 가정
	 * 기능:
	 * 단어 등록
	 * 
	 * 단어 검색
	 * 단어 수정
	 * 단어 삭제
	 * Word 클래스
	 *  word: 영단어
	 *  meanning:뜻
	 *  단어 출력,단어 수정,단어 확인:주어진 문자열과 같은 단어인지 확인 
	 * 2.틀 작성
	 * 문자열 비교
	 * */
	private static Scanner scan = new Scanner(System.in);
	private static word[] list=new word[10];
	private static int count =0;
	public static void main(String[] args) {
		//반복문
		int menu;
		do {
			
		
			//메뉴 출력
		printMenu();
			//메뉴 선택
		menu=scan.nextInt();
			//선택한 메뉴에 맞는 기능 실행
		runMenu(menu);
		}while(menu!=5);
	}
	public static void printMenu() {
		System.out.println("--------------------");
		System.out.println("1.단어 등록");
		System.out.println("2.단어 검색");
		System.out.println("3.단어 수정");
		System.out.println("4.단어 삭제");
		System.out.println("5.프로그램 종료");
		System.out.println("--------------------");
		System.out.println("메뉴 선택:");
	}
	public static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertWord();
			break;
		case 2:
			System.out.println("단어 검색");
			serchWord();
			break;
		case 3:
			System.out.println("단어 수정");
			updateWord();
			break;
		case 4:
			System.out.println("단어 삭제");
			deleteWord();
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
		}
	}
	public static void insertWord() {
		//단어와 뜻 입력
		System.out.println("단어:");
		String word=scan.next();
		System.out.println("의미:");
		scan.nextLine();
		String mean=scan.nextLine();
		//단어와 뜻을 이용하여 word의 인스턴스를 생성
		word tmp=new word(word,mean);
		//위에서 생성한 인스턴스를 단어장에 저장
		list[count] =tmp;
		//저장된 단어의 개수를 1증가
		count++;
		if(count==list.length) {
			expandWordList();
		}
	}
	public static void serchWord() {
		//검색할 단어 입력
		System.out.println("단어:");
		String word=scan.next();
		//단어장에서 검색해서 결과를 출력
		
		//반복문: 저장된 개수만큼
		for(int i=0;i<count;i++) {
			
			//단어장에 단어가 주어진 단어와 일치하면
		if(list[i].equals(word)) {
			//출력 후 종료
			list[i].print();
			return;
			}
		}
		
		
		System.out.println("일치하는 단어가 없습니다.");//단어가 없다고 출력
	}
	//기존 단어장보다 큰 단어장 생성
	public static void expandWordList() {
		word[] tmpList =new word[list.length+10];
		System.arraycopy(list, 0, tmpList, 0, count);
		list=tmpList;
	}
	public static void updateWord() {
	//단어와 뜻을 입력
	System.out.println("단어:");
	String word=scan.next();
	System.out.println("의미:");
	scan.nextLine();
	String mean=scan.nextLine();
	for(int i=0;i<count;i++) {
		if(list[i].equals(word)) {
			list[i].update(mean);
			System.out.println("단어가 수정되었습니다.");
			return;
		}
	}
	
	}
	public static void deleteWord() {
		
	}
}
