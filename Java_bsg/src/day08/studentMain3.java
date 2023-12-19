package day08;

public class studentMain3 {

	public static void main(String[] args) {
		// Student2 클래스의 생성자를 이용한 예제
		//기본 생성자가 없어서 에러가 발생
		//student2 std = new student2();
		student2 std= new student2(1, 1, 1, "홍길동");
		std.printScor();
	}

}
