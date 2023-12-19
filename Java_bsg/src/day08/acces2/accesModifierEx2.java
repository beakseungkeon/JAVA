package day08.acces2;

import day08.acces1.Student;

public class accesModifierEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std= new Student();
		//grade의 접근제어자가 private이어서 다른 패키지에 있는 클래스에서 사용 불가능
		//std.grade=1;
		//std.classNum=1;//classNum의 접근제어자가 디폴트여서 다른 패키지에 있는 클래스에서 사용 불가능
		std.num=1;//num의 접근제어자가 public  이여서 사용가능
		
		
	}

}
