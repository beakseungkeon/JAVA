package day13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class lombokEx1 {

	public static void main(String[] args) {
		// 
		Test t=new Test(1,2);
		t.print();
		t.setNum1(10);
		System.out.println(t.getNum1());
		System.out.println(t.getNum2());
		System.out.println(t);
	}

}
@Data
@AllArgsConstructor//모든 멤버들이 매개변수로 들어간 생성자를 생성
@NoArgsConstructor//기본생성자 추가
class Test{
	private int num1;
	private int num2;
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
