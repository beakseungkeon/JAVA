package day06;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		// 정수 num가 주어졌을 때 홀수인지 짝수인지 판별하는 예제
		
		//num가 1~100사이의 랜덤한 수를 생성하는 코드를 작성
		int min=1,max=100;
		
		int TotalMoney=10000;//게임시작 자금
		//사용자가 0또는 1을 입력받은 코드를 작성 0:짝수 1:홀수
		
		//사용자가 게임에 투입할 금액을 입력하는 코드 작성(1~현재 금액까지)
		Scanner scan = new Scanner(System.in);
		int bet=0;
		while(true) {
			int num=(int)(Math.random()*(max-min+1)+min);
		while(true) {
		System.out.println("현재 돈:"+TotalMoney);
		System.out.println("배팅할 금액을 입력하세요:");
		bet=scan.nextInt();
		if(bet>=1&&bet<=TotalMoney) {
			break;
		}
		System.out.println("잘못된 입력입니다.");
		System.out.println("현재 가진 돈 "+TotalMoney);
		}
		int holjjak=num%2;
		System.out.println("홀짝을 입력하세요(짝:0 홀:1):");
		int input=scan.nextInt();
		if(holjjak==0) {
			System.out.println(num+"는 짝수입니다.");
		}else System.out.println(num+"는 홀수입니다.");
		//사용자가 입력한 값이 맞았는지 틀렸는지 출력
		if(holjjak==input) {
			System.out.println("정답입니다.");
			TotalMoney+=bet;
		}
		else if(input<0||input>1) System.out.println("잘못된입력입니다.");
		
		else{
			System.out.println("틀렸습니다.");
			TotalMoney-=bet;
			}
		if(TotalMoney==0)break;
		}
		
	}

}
