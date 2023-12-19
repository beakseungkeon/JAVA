package day08;

public class studentMain2 {

	public static void main(String[] args) {
		// 5명의 학생을 저장하기 위한 배열 생성
		student stds[]=new student[5];
		//학생 5명의 학생 정보를 출력하는 코드를 작성하세요
		for(int i=0;i<5;i++) {
			//
			stds[i]=new student();
			stds[i].printInfo();
		}
	}

}
