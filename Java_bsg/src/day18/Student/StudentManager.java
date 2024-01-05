package day18.Student;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentManager {

	private List<Student> list = new ArrayList<Student>();

	public StudentManager(List<Student> list) {
		if(list == null) {
			return;
		}
		this.list = list;
	}

	public boolean insertStudent(Student std) {
		//중복체크
		if(list.contains(std)) {
			return false;
		}
		//아니면 추가
		list.add(std);
		return true;
	}
	
	public void printStudent() {
		list.stream().forEach(s->System.out.println(s));
	}
	
	}

