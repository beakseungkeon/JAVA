package day02;

public class prefixIncrementOperatorEx1 {
	//증감연산자 예제
	public static void main(String[] args) {
		int num1=1,num2=1;
		//num1은 전위형 증가 연산자,num2는 후위형 증가 연산자
		System.out.println("증가전:num1="+num1+",num2="+num2);		
		//num1은 1에서 2로 증가 후에 "증가 중:num1="라는 문자열과 더함
		//num2은 "증가 중:num1="라는 문자열과 더하고 1에서 2로 증가 
		System.out.println("증가중:num1="+ ++num1+",num2="+num2++);
		System.out.println("증가후:num1="+num1+",num2="+num2);
		
		System.out.println("==========================");
		//전위형과 후위형 동작이 잘 이해되지 않아 전위형 하나만을 이용하여 후이형도 구현
		num1=1;
		num2=1;
		System.out.println("증가전:num1="+num1+",num2="+num2);		
		++num1;
		System.out.println("증가중:num1="+ num1+",num2="+num2);
		++num2;
		System.out.println("증가후:num1="+num1+",num2="+num2);
	}

}
