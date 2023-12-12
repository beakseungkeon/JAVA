package day03;

import java.util.Scanner;

public class forPrimeNumber {

	public static void main(String[] args) {
		//소수 판별 예제
		Scanner scan=new Scanner(System.in);
		System.out.print("정수을 입력하세요:");
		int a=0;
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				a+=1;
			}
			
			i++;
		}
		if(a==2) {
			System.out.println("소수입니다.");
		}
		else System.out.println("소수가아닙니다.");
		

	}

}
