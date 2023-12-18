package day07;

import java.util.Scanner;

public class oddEvenGameEx1 {

	public static void main(String[] args) {
		/*다음 기능을 가진 프로그램을 작성하세요 메서드 이용
		 * 메뉴
		 * -------------------
		 * 1.새게임
		 * 2결과 조회
		 * 3프로그램 종료
		 * -------------------
		 * 선택(홀:1,짝:0):1
		 * 3홀입니다.
		 * 성공
		 * *
		메뉴
		 * -------------------
		 * 1.새게임
		 * 2결과 조회
		 * 3프로그램 종료*
		 * 메뉴선택:2
		 * 결과 1승0패
		 * 
		 * 
		 * 
		 * 
		 * 3프로그램종료*/
		//반복무니 프로그램 종료를 선택하기 전까지 반복
		int menu;
		Scanner scan = new Scanner(System.in);
		int win=0;
		int lose=0;
		do {
		//메뉴 출력
			menu();
		//메뉴 선택
			menu=scan.nextInt();
			System.out.println("----------------------------------");
		//선택한 메뉴에 따른 기능 실행
			
			switch(menu) {
			case 1:
				System.out.println("선택(홀:1,짝:0)");
				int haljak=scan.nextInt();
				if(newGame(haljak)) {
					System.out.println("정답입니다");
					win++;
				}else {
					System.out.println("틀렸습니다.");
					lose++;
				}
				//새 게임 메서드 구현
				break;
			case 2://기록 확인 메서드
				record(win,lose);
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			default:System.out.println("잘못된 입력");
			}
		//1선택하면 홀짝 실행
		//2선택하면 결과 조회
		}while(menu!=3);
		scan.close();
	}
	/*기능 메뉴 출력
	 * */
	public static void menu() {
		System.out.println("메뉴");
		System.out.println("1.새 게임");
		System.out.println("2.기록확인");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴 선택:");
	}
	public static boolean newGame(int num) {
		int max=100;
		int min=1;
		int num1=(int)(Math.random()*(max-min+1)+min);
		int haljak=num1%2;
		
		if(haljak==num) {
			
			return true;
		}else {
			return false;
		}
	}
	public static void record(int win,int lose) {
		System.out.println("승리:"+win+"회 "+"패배:"+lose+"회");
	}
	/*
	 * 랜덤 숫자 생성
	 * 홀짝 판별*/
	
	

}
