package day03;

import java.util.Scanner;

public class ForUpDownEx1 {

	public static void main(String[] args) {
		int min=1,max=100;
		int r=(int)(Math.random()*(max-min+1)+1);
		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int num=0 ; num!=r; ) {
			
			num=scan.nextInt();
			System.out.println("정수:"+num);
			if(num>r) {
				System.out.println("DOWN");
			}
			else System.out.println("UP");
		}
		System.out.println("정답");
		scan.close();

	}

}
