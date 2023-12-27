package day13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아이디를 입력받아 아이디 형식에 맞는지 틀리는지 출력하는 프로그램 작성
		//아이디정규 표현식:영문,숫자로 구성,8~13자리
		System.out.println("아이디:");
		Scanner scan = new Scanner(System.in);
		String id=scan.nextLine();
		String regex="^[a-z]{1}[a-z0-9]{8,13}+$";
		if(Pattern.matches(regex, id)) {
			System.out.println("올바른 형식입니다");
		}else{
			System.out.println("올바른 형식이 아닙니다.");
		}
	}

}
