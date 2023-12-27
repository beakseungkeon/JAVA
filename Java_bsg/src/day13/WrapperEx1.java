package day13;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1;
		Integer num2=1;
		num2=null;
		num2=num1;
		System.out.println(num2);
		num2=20;
		num1=num2;
		System.out.println(num1);
		
		String str="12345";
		int num3=Integer.parseInt(str);
		System.out.println(num3*10);
		//주어진 실수의 소수점 n자리에서 올림한 값을 출력하는 코드를 작성하세요
		
	}

}
