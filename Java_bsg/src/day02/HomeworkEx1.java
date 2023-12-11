package day02;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/*성적을 입력받아 성적에 맞는 학점을 출력하는 코드 작성
		 * 90이상~100미만 A
		 * 80~90		B
		 * 
		 * 
		 * 
		 * 60 미만 :F
		 * 0보다 작거나 100코다 큰 경우 : 잘못된 정수
		 * */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("성적을 입력하세요:");
		int score=scan.nextInt();
		
		if(score<0||score>100) {
			System.out.println("잘못된 점수");
		}
		else if(score<60) {
			System.out.println("F");
		}
		else if(score<70) {
			System.out.println("D");
		}
		else if(score<80) {
			System.out.println("C");
		}
		else if(score<90) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
		
	}

}
