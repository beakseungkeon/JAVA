package day06;

import java.util.Scanner;

public class ScoreEx1 {

	public static void main(String[] args) {
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
		int kor[]=new int[30];
		int eng[]=new int[30];
		int math[]=new int[30];
		int score=0;
		int serch=0;
		int student=0;
		int num=0;
		Scanner scan = new Scanner(System.in);
		int subject=0;
		label:do {
			System.out.println();
		System.out.println("메뉴");
		System.out.println("1.성적 수정");
		System.out.println("2.성적 조회");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴선택:");
		
		num=scan.nextInt();
		
		label1:if(num==1) {
			
			do{System.out.println("--성적수정--");
			System.out.println("1.국어");
			System.out.println("2.영어");
			System.out.println("3.수학");
			System.out.print("과목 선택:");
			subject=scan.nextInt();
			System.out.println("학생 선택:");
			student=scan.nextInt();
			System.out.println("성적 입력");
			score=scan.nextInt();
			switch(subject) {
			case 1:kor[student-1]=score;break label1;
			case 2:eng[student-1]=score;break label1;
			case 3:math[student-1]=score;break label1;
			
			}
			
			
			}while(num!=4);
			
		}
		//----------------------------------------------------
		else if(num==2) {
				do{System.out.println("--성적조회--");
				System.out.println("1.과목별조회");
				System.out.println("2.학생별조회");
				System.out.println("선택:");
				serch=scan.nextInt();
				if(serch==1) {
					System.out.println("과목별 조회");
					System.out.println("1.국어");
					System.out.println("2.영어");
					System.out.println("3.수학");
					System.out.println("과목 입력:");
					subject=scan.nextInt();
					switch(subject) {
					case 1:{
						for(int i=0;i<kor.length;i++) {
							System.out.println((i+1)+"번 학생"+kor[i]);
						}break label1;
					}
					case 2:{
						for(int i=0;i<eng.length;i++) {
							System.out.println((i+1)+"번 학생"+eng[i]);
						}break label1;
					}
					case 3:{
						for(int i=0;i<kor.length;i++) {
							System.out.println((i+1)+"번 학생"+eng[i]);
						}break label1;
					}
					}
				}
				else if(serch==2) {
					System.out.println("학생 선택:");
					student=scan.nextInt();
					System.out.println("국어:"+kor[student-1]);
					System.out.println("영어:"+eng[student-1]);
					System.out.println("수학:"+math[student-1]);
					
				}
				}while(num!=3);
				

			}
		
		}while(num!=3);
		System.out.println("프로그램을 종료합니다...");
		System.out.println(kor.length);
		
	}

}
