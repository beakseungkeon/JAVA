package day07;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//리턴값이 있는 경우 리턴값을 변수에 저장하여 사용
		int num1=1,num2=2;int result=sum(num1,num2);
		System.out.println(num1+"+"+num2+"="+result);
		
	}
/** 두 정수의 합을 알려주는 메서드
 * 매개변수: int num1,int num2
 * 리턴타입: int 
 * 메서드명: sum*/
	public static int sum(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
}
