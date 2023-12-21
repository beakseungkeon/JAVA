package day10.word;

import java.util.Scanner;

import day10.board.board;

public class wordMain {
	static Scanner scan = new Scanner(System.in);
	static word word [] = new word[1];
	static int count=0;
	static String mean;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*영어 단어장 프로그램을 만드세요
		 * 
		 * 
		 * 
		 * 1. 기능 정리
		 * 단어 추가,단어 수정,단어 검색,단어 삭제
		 * 2.틀 작성
		 * 
		 * 
		 * 
		 * 
		 * 3.필요한 메서드 구현
		 * 메뉴
		 * 1.단어 검색
		 * 2.단어 추가
		 * 3.단어 수정
		 * 4.단어 삭제
		 * 5.프로그램 종료
		 * 메뉴 선택:1
		 * 
		 * 검색할 단어:apple
		 * 뜻:사과
		 * 
		 * 메뉴
		 * 1.단어 검색
		 * 2.단어 추가
		 * 3.단어 수정
		 * 4.단어 삭제
		 * 5.프로그램 종료
		 * 메뉴 선택:2
		 * 
		 * 추가할 단어:apple
		 * 뜻:사과
		 * 
		 *1.단어 검색
		 * 2.단어 추가
		 * 3.단어 수정
		 * 4.단어 삭제
		 * 5.프로그램 종료
		 * 메뉴 선택:3
		 * 
		 * 수정할 단어:apple
		 * 뜻:바나나
		 * 
		 * 메뉴
		 * 1.단어 검색
		 * 2.단어 추가
		 * 3.단어 수정
		 * 4.단어 삭제
		 * 5.프로그램 종료
		 * 메뉴 선택:4
		 * 
		 * 삭제할 단어 선택:apple
		 * 삭제되었습니다.
		 * */
		int menu;
		do {
			printMenu();
			menu=scan.nextInt();
			runMenu(menu);
		}while(menu!=5);
	}
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1.단어 검색");
		System.out.println("2.단어 추가");
		System.out.println("3.단어 수정");
		System.out.println("4.단어 삭제");
		System.out.println("5.프로그램 종료");
	}
	public static void runMenu(int menu) {
		switch(menu){
		case 1:
			System.out.println("검색할 단어:");
			String serchWord=scan.next();
			for(int i=0;i<word.length-1;i++) {
				if(serchWord.equals(word[i].getWord())) {
					System.err.println(word[i].getWord());
					System.err.println(word[i].getMean());
				}
			}
			break;
		case 2:
			word[count]=new word( "1", "1");
			
			System.out.println("추가할 단어");
			word[count].setWord(scan.next());
			System.out.println("뜻:");
			word[count].setMean(scan.next());
			count++;
			word[] tmpList=new word[word.length+1];
			System.arraycopy(word, 0, tmpList, 0, count);
			word=tmpList;
			break;
		case 3:
			System.out.println("수정할 단어:");
			serchWord=scan.next();
			System.out.println("수정할 뜻:");
			String newmean=scan.next();
			for(int i=0;i<word.length-1;i++) {
				if(serchWord.equals(word[i].getWord())) {
					word[i].setMean(newmean);
				}
			}
			break;
		case 4:
			System.out.println("삭제할 단어:");
			serchWord=scan.next();
			for(int i=0;i<count-1;i++) {
				if(word[i].getWord().equals(serchWord)) {
					for(int j=i;i<count-1;i++) {
						word[i]=word[i+1];
						
						
					}
				}
				
				
			}
			word[] tmp=new word[word.length-1];
			System.arraycopy(word, 0, tmp, 0, count);
			word=tmp;
			
			count--;
			break;
			
		}
	}
}
