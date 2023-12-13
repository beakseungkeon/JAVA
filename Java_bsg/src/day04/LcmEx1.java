package day04;

import java.util.Scanner;

public class LcmEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수을 입력하세요:");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.print(a+"의 배수:");
		for(int i=1;i<=10;i++) {
			System.out.print(a*i+",");
			
		}
		System.out.println();
		System.out.print(b+"의 배수:");
		for(int i=1;i<=10;i++) {
			System.out.print(b*i+",");
			
		}
		//최소 공배수는 두 정수의 곱보다는 작다
		System.out.println();
		System.out.print(a+"와"+b+"의 공배수:");
		for(int i=1;i<=a*b;i++) {
			if(i%a==0&&i%b==0) {
				System.out.print(i+",");
			}
			
		}
		System.out.println();
		System.out.print(a+"와"+b+"의 최소공배수:");
		for(int i=1;i<=a*b;i++) {
			if(i%a==0&&i%b==0) {
				System.out.print(i);
				break;
			}
			
		}
		
	}

}
