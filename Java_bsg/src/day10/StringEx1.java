package day10;

public class StringEx1 {

	public static void main(String[] args) {
		// 문자열 비교 예제
		
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		//데이터 영역의 문자열 주소와 인스턴스 문자열 주소가 다르므로 false가 나온다.
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);

	}

}
