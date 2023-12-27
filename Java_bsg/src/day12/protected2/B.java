package day12.protected2;

import day12.protected1.A;

public class B extends A{
public void print() {
	//num1은 private여서 자식 클래스에서도 접근x
	//System.out.println(num1);
	//num2은 defualt여서 다른 패키지에 있는 클래스에서 접근 x
	//System.out.println(num2);
	//num3는 protected여서 다른 패키지와 상관없이 자식 클래스에서 접근o
	System.out.println(num3);
	//num4는 public이여서 접근가능
	System.out.println(num4);
	}
}
