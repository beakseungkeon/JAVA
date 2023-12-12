package day03;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		/*산술 연산자와 두 정수를 입력받아
		 * 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요:");
		int num1=scan.nextInt();
		String str1=scan.next();
		int num2=scan.nextInt();
		
		//char는 1byte이고 int 는 4byte이기 때문에 char+int이면 전부 int로 형변환이 일어난다.
		switch(str1) {
		case"+":System.out.println(num1+"+"+num2+"="+(num1+num2));
		break;
		case"-":System.out.println(num1+"-"+num2+"="+(num1-num2));
		break;
		case"*":System.out.println(num1+"*"+num2+"="+(num1*num2));
		break;
		case"/":System.out.println(num1+"/"+num2+"="+(num1/num2));
		break;
		default:System.out.println(str1+"은 연산자가 아닙니다");
		}
	}

}
