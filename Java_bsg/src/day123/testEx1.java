package day123;

import lombok.Getter;

public class testEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		System.out.println(t.getNum1());
	}

}
@Getter
class Test{
	private int num1;
	private int num2;
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
	}
}