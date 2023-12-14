package day05;

import java.util.Scanner;

public class ThirtyOneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*사용자와 컴퓨터가 돌아가면서 최대 3개의 숫자를 부르고 31을 입력한 사용자 또는 컴퓨터가 지는 게임*/
		int min=1,max=3;
		int arr[]=new int[32];
		int num=0;
		Scanner scan = new Scanner(System.in);
		int a=0;
		for(int i=1;i<32;i++) {
			arr[i]=i;
		}
		System.out.println("시작!");
		loop:
		while(true) {
			
			int r=(int)(Math.random()*(max-min+1)+1);
			
			for(int i=0;i<r;i++) {
				num++;
				System.out.println(arr[num]);
				if(num==31) {
					System.out.println("승리!");
					break loop;
				}
				
			}
			System.out.println("정수 입력 (최대 3개):");
			a=scan.nextInt();
			for(int i=0;i<a;i++) {
				num++;
				System.out.println(arr[num]);
				if(num==31) {
					System.out.println("패배!");
					break loop;
				}
				
			}
			System.out.println("-----------------------------");
			
		}
		
	}

}
