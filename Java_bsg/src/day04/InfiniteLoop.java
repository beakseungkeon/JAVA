package day04;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수 입력:");
			int num=scan.nextInt();
			System.out.println("정수 출력: "+num);
		}
		//무한루프가 100% 발생하는 코드 아래에 있는 코드는 에러가 발생
		//절대 실행될 일이 없어서
		System.out.println("시스템 종료");
	}

}
