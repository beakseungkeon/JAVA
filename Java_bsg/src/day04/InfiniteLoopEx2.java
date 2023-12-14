package day04;

import java.util.Scanner;

public class InfiniteLoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		for(int i=10;i>0;) {
			System.out.println("정수 입력:");
			 num=scan.nextInt();
			System.out.println("정수 출력: "+num);
		}
		//조건식에 따라 True가 될수도 있기 떄문에 에러 발생 x
		System.out.println("프로그램 종료");
		
		//위 코드는 무한루프이고 아래 코드는 무수히 많이 실행
		//int의 범위를 벗어나면 오버플로우 현상에 의해 음수로 바뀌면서 멈춤
		for(int i=10;i>0;) {
			System.out.println("정수 입력:");
			 num=scan.nextInt();
			System.out.println("정수 출력: "+num);
		}
	}

}
