package day08;

public class ConstructorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A(2);//개본 생성자 호출=>A클래스에 생성자가 있어서 기본 생성자가 자동으로 추가 안됨 
		System.out.println(a.num);
		A a1= new A(1.3);
		System.out.println(a1.num);
		A a2=new A(a1);
		System.out.println(a2.num);
		
	}

}
class A{
	int num;
	
	public A(int num2) {
		num=num2;
	}
	public A(double num2) {
		num=(int)num2;
	}
	public A(A a) {
		num=a.num;
	}
}