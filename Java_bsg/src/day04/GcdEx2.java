package day04;

import java.util.Scanner;

public class GcdEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*두 정수의 공약수를 출력하는 코드를 작성하세요*/
		Scanner scan=new Scanner(System.in);
		System.out.print("정수을 입력하세요:");
		int a=0;
		int b=0;
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.print(a+"의 약수:");
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print((i==1?"":",")+i);
				
			}
		}
		System.out.println("");
		System.out.print(b+"의 약수");
		for(int i=1;i<=b;i++) {
			if(b%i==0) {
				System.out.print((i==1?"":",")+i);
				
			}
		}
		System.out.println("");
		System.out.print(a+"와"+b+"의 공약수:");
		for(int i=1;i<=(b>=a?b:a);i++) {
			if(b%i==0 && a%i==0) {
				System.out.print((i==1?"":",")+i);
			}
		}
	}

}
