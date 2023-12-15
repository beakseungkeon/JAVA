package day06;

import java.util.Scanner;

public class ArithmeticEx2 {

	public static void main(String[] args) {
		// 랜덤으로 산수(+,-,X)문제를 생성하여 맞추는 게임
		int answer=0;
		Scanner scan = new Scanner(System.in);
		char san[]=new char[] {'+','-','x'};
		int min=0,max=2;
		int Min=1,Max=99;
		while(true){
		int num=(int)(Math.random()*(Max-Min+1)+Min);
		int num2=(int)(Math.random()*(Max-Min+1)+Min);
		int am=(int)(Math.random()*(max-min+1)+min);
		
		System.out.print(""+num+san[am]+num2+"=");
		
		int input=scan.nextInt();
		
		switch(san[am]) {
		case '+':answer=num+num2;break;
		case '-':answer=num-num2;break;
		case 'x':answer=num*num2;break;
			}
		if(input==answer) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("틀렸습니다");
			System.out.println("정답은:"+answer);
		}
			
		}
		
	}

}
