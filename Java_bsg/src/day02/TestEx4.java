package day02;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		// 성인 판별 예제 
		/* 나이를 입력받아 나익사 20세 이상이면 성인, 20세 미만이면 미성년자로 출력*/
		Scanner scan=new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		int age=scan.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}
		scan.close();
	}

}
