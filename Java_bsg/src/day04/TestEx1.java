package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		//Scanner을 이용하여 국어,영어,수학 성적을 입력받고 총점과 평균을 구하는 코드를 작성하세요
		Scanner scan=new Scanner(System.in);
		System.out.print("국어,영어,수학 성적을 입력하세요:");
		int korean=scan.nextInt();
		int english=scan.nextInt();
		int math=scan.nextInt();
		
		System.out.println("총점:"+(korean+english+math));
		System.out.println("평균:"+(korean+english+math)/(float)3);
		
		scan.close();
	}

}
