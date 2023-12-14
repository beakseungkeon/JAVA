package day04;

import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		// 1에서 9 사이의 정수를 10개 입력받아 각 숫자가 몇개씩 입력했는지 출력하는 코드를 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		int num[]=new int[9];
		
		int input[]=new int[9] ;
		
		// 10개 입력받기
		for(int i=0;i<9;i++) {
			System.out.println("1부터 9 사이의 정수를 입력하세요");
			num[i]=scan.nextInt();
		}
		//입력 받은 개수 판별
		System.out.println(num.length);
		for(int i=0;i<num.length;i++) {
			for(int j=1;j<input.length;j++) {
				if(num[i]==j) {
					input[j]++;
					
				}
			}
		}
		for(int i=0;i<(input.length);i++) {
			System.out.println((i+1)+" : "+input[i]);
		}
		
		scan.close();

	}

}
