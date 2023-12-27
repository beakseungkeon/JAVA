package day13;

public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//주어진 실수의 소수점 3자리에서 올림한 값을 출력하는 코드를 작성하세요
		double num=1.234567;
		num=num*1000;
	
		num=Math.ceil(num)/1000;
		System.out.println(num);
		int n=3;
		double num2=1.234567;
		num2=n*(Math.pow(10, n));
		num=Math.ceil(num2)/Math.pow(10, n);
	}

}
