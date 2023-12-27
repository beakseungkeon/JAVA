package day13;

import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*^[abc]$
		한글자이고 a,b,c중 하나
		^[abc]+$
		문자열이 abc로만 되어 있고,1글자 이상인 경우
		^[a-z]$
		한글자이고 a~z사이ㅇ
		^\d$
		숫자 1개
		^\d{3,5}$
		숫자3~5자
		^\d{3,}$
		3자 이상
		^\d{3}$
		3자
		^(010|011|012)$
		010 011 012 인 경우*/
		String  str="abc";
		String regex="^[a-zA-Z]{3}$";//영어 3개
		if(Pattern.matches(regex, str)) {
			System.out.println("영문자이고 3자입니다.");
		}else{
			System.out.println("영문자가 아니거나 3자가 아닙니다.");
		}

	}

}
