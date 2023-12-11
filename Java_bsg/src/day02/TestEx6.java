package day02;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		/*산술 연산자와 두 정수를 입력받아
		 * 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요:");
		int num1=scan.nextInt();
		String str1=scan.next();
		int num2=scan.nextInt();
		
		//문자열을 비교하려면 .equals()를 사용하여 비교
		// A.equals("B") => A=="B"
		if(str1.equals("+")) {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(str1.equals("-")) {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(str1.equals("*")) {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(str1.equals("/")) {
			System.out.println(num1+"-"+num2+"="+(num1/(double)num2));
		}
		else {
			System.out.println(str1+"은 연산자가 아닙니다");
		}
		scan.close();
	}

}
