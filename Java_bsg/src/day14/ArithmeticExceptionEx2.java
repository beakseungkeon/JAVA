package day14;

import java.util.Scanner;

public class ArithmeticExceptionEx2 {

	public static void main(String[] args) {
		// 두 정수와 산술연산자를 입력받아 결과를 출력하는 메서드를 구현하세요 메서드를 이용 throws와 throw를 이용
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0;
		String arithmetic1;
		System.out.println("입력:");
		num1=scan.nextInt();
		arithmetic1=scan.next();
		num2=scan.nextInt();
		try{print(num1,arithmetic1,num2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
public static void print(int num1,String arithmetic1,int num2) {
	switch(arithmetic1) {
	case "+":System.out.println(num1+"+"+num2+"="+(num1+num2));
		break;
	case "-":System.out.println(num1+"-"+num2+"="+(num1-num2));
		break;
	case "*":System.out.println(num1+"*"+num2+"="+(num1*num2));
		break;
	case "/":if(num2==0) {
		throw new ArithmeticException("0으로 나눌 수 없습니다.");
	}
	System.out.println(num1/(double)num2);
	break;
	
	}
	
}
}
