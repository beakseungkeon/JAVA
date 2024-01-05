package day18.Student;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = -8589394362666912623L;
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
@Override
public String toString() {
	return "Student [grade=" + grade + ", classNum=" + classNum + ", num=" + num + ", name=" + name + "]";
}
}
