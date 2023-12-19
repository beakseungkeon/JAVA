package day08;

import java.util.Scanner;

public class studentProgram {
	/* 다음 기능을 가진 성적 관리 프로그램을 작성하세요
	1반에 성적을 관리합니다
	최대 30명
	성적은 번호순으로 관리
	성적은 국어,영어,수학 성적을 관리
	메뉴
	-1.성적수정
	-2.성적조회
	3프로그램종료
	메뉴선택:
	
	

	
	
	
	--과목별 조회
	1국어
	2영어
	3수학
	과목선택:
	
	1번:0점
	2번:
	3번:100점
	
	
	학생선택:3
	국어:~점
	영어:~점
	수학:~점
	*/
	
	public static void main(String[] args) {
		//반복문:프로그램 종료를 선택하지 않으면 반복
		//학년,이름은 생략하고,반은 1반으로 고정
		//번호은 각각 1번부터 5번으로 저장
		//5명의 학생 정보를 저장할 수 있는 배열을 생성
		student stds[]=new student[6];
		//각 학생의 번호를 1번부터 5번까지 지정
		for(int i=1;i<=5;i++) {
			//
			stds[i]=new student();
			stds[i].num=i;
			
		}
		int num;
		int num2;
		
		int subject;
		Scanner scan = new Scanner(System.in);
			int score;
		do {
			printMenu();
			num=scan.nextInt();
			switch(num) {
			case 1:System.out.println("학생 선택");
				num2=scan.nextInt();
				menu2();
				System.out.println("과목 선택:");
				subject=scan.nextInt();
				System.out.println("점수 입력");
				score=scan.nextInt();
				switch(subject) {
				case 1:
					stds[num2].setKor(score);
					break;
				case 2:
					stds[num2].setEng(score);
					break;
				case 3:
					stds[num2].setEng(score);
					break;
				}
				
				
			break;
			case 2:
				System.out.println("과목별 성적:");
				System.out.println("학생별 성적:");
				score=scan.nextInt();
				switch(score) {
				case 1: System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.print("과목 입력:");
						subject=scan.nextInt();
						switch(subject) {
						case 1:for(int i=1;i<=5;i++) {
							System.out.println(stds[i].kor);
						}break;
						case 2:
							for(int i=1;i<=5;i++) {
								System.out.println(stds[i].eng);
							}break;
						case 3:for(int i=1;i<=5;i++) {
							System.out.println(stds[i].math);
						}
						break;
						}break;
				case 2:System.out.println("학생 선택:");
				num2=scan.nextInt();
				stds[num2].printScor();break;
				}
				break;
				
			default:break;
			}
		}while(num!=3);
			System.out.println("프로그램 종료");

	}
public static void printMenu() {
	System.out.println("----------------------");
	System.out.println("메뉴");
	System.out.println("1.성적수정");
	System.out.println("2.성적조회");
	System.out.println("3.프로그램종료");
	System.out.println("메뉴선택:");
	
	}
public static void printScore() {
	System.out.println("메뉴");
	System.out.println("학생 선택:");
	
	
}
public static void menu2() {
	System.out.println("1.국어");
	System.out.println("2.영어");
	System.out.println("3.수학");
}
