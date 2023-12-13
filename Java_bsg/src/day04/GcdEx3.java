package day04;

import java.util.Scanner;

public class GcdEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 정수의 최대 공약수를 구하는 코드를 작성하세요
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수을 입력하세요:");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int max=0;
		for(int i=1;i<=(b>=a?b:a);i++) {
			if(b%i==0 && a%i==0) {
				if(i>max) {
					max=i;
				}
			}
			
		}
		System.out.println("두 정수의 최대공약수는"+max);
		
		
	}

}
