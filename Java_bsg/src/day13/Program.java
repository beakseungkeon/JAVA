package day13;

public interface Program {
	//int num1=10;//변수앞에 final static 자동 추가 상수이므로 초기화
	//final static int num2=20;
	//메서드 앞에 public abstract가 자동으로 추가
	void printMenu();
	public void runMenu();
	public abstract void printExit();
	void run();
	default void test() {};
}
abstract class TestA{
	//final static 을 생략하면 멤버변수,붙여주면 상수
	int num1=10;
	final static int num2=20;
	//메서드 앞에 public abstract가 자동으로 추가x
	public abstract void printMenu();
}
