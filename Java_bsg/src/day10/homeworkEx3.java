package day10;

public class homeworkEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			student[] stds=new student[5];
			stds[0]=new student(1,1,1,"홍길동");
			stds[1]=new student(1,1,2,"임꺽정");
			
			stds[0].insertSubject("국어", 100);
			stds[0].insertSubject("영어", 50);
			stds[1].insertSubject("국어", 90);
			stds[1].insertSubject("수학", 0);
			
			stds[0].print();
			stds[1].print();
			
			stds[0].updateSubject("국어", 50);
			stds[0].deleteSubject("영어");
			
			stds[0].print();
			
			stds[0].insertSubject("영어", 100);
			stds[0].print();
			
	}

}
