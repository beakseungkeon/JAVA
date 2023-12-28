package day14;

import lombok.Data;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	public static void test() throws MyException{
		throw new MyException("안녕하세요","무조건 예외 발생");
	}

}
@Data
class Myexception extends Exception{
	private String title;
	
	public void MyException() {}
	
	public Myexception(String title,String message) {
		super();
		this.title =title;
		
	}
	public void print() {
		System.out.println(title);
		System.out.println(getMessage());
	}
}
