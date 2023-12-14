package day05;

import java.util.Scanner;

public class ReverseNumberEx1 {

	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세요
		Scanner scan = new Scanner(System.in);
		/*System.out.println("정수를 입력하세요");
		String str=scan.next();
		
		for(int i=(str.length()-1);i>=0;i--) {
			System.out.print(str.charAt(i));
		}*/
		//------------------------------------------------------------------------------------------
		
		//정수를 입력하여 num에 저장
		System.out.println("정수입력:");
		int num=scan.nextInt();
		//tmp에 num를 복사
		int tmp=num;
		//10개짜리 배열 arr를 선언
		int arr[]=new int[10];
		//추출되어 저장된 개수를 의미하는 count변수를 선언
		int count=0;
		//반복문(tmp가 0이 아닐때까지)
		//tmp를 10으로 나눈 나머지를 배열에 저장[count번지]
		
		while(tmp!=0) {
			arr[count]=tmp%10;
			tmp=tmp/10;
			count++;
			
			
		}
		
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]);
		}
		
		//count증가
		
		//tmp를 10으로 나눈 값을 tmp에 다시 저장
		
		//tmp가 0이되면 반복문을 이용하여 arr의 값을 0번지부터 count개 만큼 출력
		
		
		
		scan.close();
	}

}
