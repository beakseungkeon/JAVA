package day13;

public class StringEx1 {

	public static void main(String[] args) {
		String str="abcde";
		System.out.println("1.--------------------");
		//0번지에 있는 문자를 반환
		System.out.println(str.charAt(0));
		System.out.println("2.--------------------");
		//두 문자열이 같은지를 반환
		System.out.println(str.equals("abc"));
		System.out.println(str.equals("abcde"));
		System.out.println("3.--------------------");
		//있으면 시작번지를 반환
		System.out.println(str.indexOf("cdf"));
		System.out.println("4.--------------------");
		//있으면 있다,없으면 없다를 반환
		System.out.println(str.contains("cdf"));
		System.out.println("5.--------------------");
		//문자열의 길이를 반환
		System.out.println(str.length());
		System.out.println("6.--------------------");
		
		//문자열을 바꿔서 새 문자열을 반환
		String str2=str.replace("cd", "aa");
		System.out.println(str);
		System.out.println(str2);
		System.out.println("7.--------------------");
		//부분 문자열을 반환
		String str3=str.substring(1,3);
		System.out.println(str);
		System.out.println(str3);
		System.out.println("8.--------------------");
		
		//대문자로
		String str4=str.toUpperCase();
		System.out.println(str);
		System.out.println(str4);
		System.out.println("9.--------------------");
		//소문자로
		String str5=str4.toLowerCase();
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("10.--------------------");
		String str6="\n\nabc\tdef\t\t";
		String str7=str6.trim();
		System.out.println(str7);
		
		String fruits="사과,배,오렌지";
		String []fruitArray=fruits.split(",");
		System.out.println(fruits);
		for(String tmp:fruitArray) {
			System.out.println(tmp);
		}
	}

}
