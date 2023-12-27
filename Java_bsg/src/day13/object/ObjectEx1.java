package day13.object;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class ObjectEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		
		System.out.println(a.toString());
		Student std1=new Student(1, 1, 1, "홍길동");
		Student std2=new Student(1, 1, 1, "임꺽정");
		if(std1.equals(std2)) {
			System.out.println("학년,반,번호가 같습니다");
		}else {
			System.out.println("학년,반,번호가 다릅니다");
		}
	}

}
@AllArgsConstructor
class Student{
	int grade,classNum,num;
	String name;
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	
}
class A{
	int num1 =10;
	int num2=3;
	String name="테스트";
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + ", name=" + name + "]";
	}
	
}
