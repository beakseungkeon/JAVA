package day14;

import java.util.Scanner;

public class ArithmeticExceptionEx1 {

	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 산술연산하는 코드를 작성하세요.
		//단,0으로 나눌 때 예외처리를 적용
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0;
		String arithmetic1;
		System.out.println("입력:");
		num1=scan.nextInt();
		arithmetic1=scan.next();
		num2=scan.nextInt();
		switch(arithmetic1) {
		case "+":System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case "-":System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case "*":System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case "/":try{System.out.println(num1+"/"+num2+"="+(num1/num2));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		}
			break;
		
		}
		
		
		
		scan.close();

	}

}
