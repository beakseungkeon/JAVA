package day02;

public class AssinmentOperater {
	//대입 연선자 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1; int num2=2;
		num1=10;
		//리터럴 10을 num1의 값으로 변경할 수 없기 때문에 에러가 발생
		//10=num1;
		
		int num3;
		num3= num1+num2;
		
		//왼쪽에는 식이 올 수 없다 
		//num1+num2=num3;
		System.out.println(num3);
	}

}
