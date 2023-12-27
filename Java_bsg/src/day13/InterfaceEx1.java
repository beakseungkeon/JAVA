package day13;

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(KiaCar.brand);
		//static은 인스턴스없이 호출 가능
		Printer.print();
		
	}

}
class KiaCar{
	public static String brand="기아";
}
//static이 붙은 메서드는 반드시 구현해야함
interface Printer{
	static void print() {
		System.out.println("프린터입니다.");
		
	}
	//static이 안 붙은 메서드는 추상메서드로 만들어서 구현하지 않거나
	void test();
	
	default void test2() {}
}