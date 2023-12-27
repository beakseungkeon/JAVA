package day12;

public class OverrrideEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		d.print1();
		d.print2();
		d.print1(2);
		
	}

}
class C{
	protected int num1=1,num2=2;
	
	protected void print1() {
		System.out.println(num1);
		System.out.println(num2);
	}
	public void print2() {
		System.out.println(num1);
		System.out.println(num2);
	}
}
class D extends C{
	@Override
	/*1.매개변수가 부모 클래스에는 없음
	 *2.부모 클래스에서는 접근제어자가 protected였는데 여기선 defualt
	void print1(int num1) {
	*/	
	protected void print1() {
		System.out.println(num1);
		System.out.println(num2);
	}
	public void print2() {
		super.print2();
		System.out.println("B 클래스의 메서드입니다.");
		
	}
	protected void print1(int num) {
		System.out.println(num1);
		System.out.println(num2);
	}
}
