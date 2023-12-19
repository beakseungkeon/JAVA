package day08.acces1;

public class accesModifierEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std= new Student();
		//grade의 접근제어자가 private이어서 같은 패키지에 있는 클래스에서 사용 불가능
		//std.grade=1;
		std.classNum=2;//classNum의 접근제어자가 디폴트여서 같은 패키지에 있는 클래스에서 사용 가능
		std.num=3;//num의 접근제어자가 public  이여서 사용가능
		//grade가 pravate여서 수정하기 위해 setter를 이용하여 수정
		std.setGrade(1);
		System.out.println(std.getGrade());
	}

}
