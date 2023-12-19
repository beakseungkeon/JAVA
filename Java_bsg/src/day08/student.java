package day08;
/*학생의 국어,영어,수학 성적을 관리하기 위한 프로그램 작성
 * 이 때 필요한 학생 클래스를 생성해보세요*/
public class student {
//멤버변수:국어,영어,수학,학생번호,학년,반,이름
	int kor,eng,math;
	int grade,classNum,num;
	String name;
//메서드:학생 정보 확인,학생 성적 확인,국어성적 수정,수학성적 수정,영어성적 수정
	/*기능:학생 정보(학년,반,번호,이름)을 콘솔에 출력하는 메서드
	 * 매개변수:
	 * 리턴타입:void
	 * 메서드명:printInfo
	 * */
	public void printInfo() {
		System.out.println("---------------");
		System.out.println("학년:"+grade);
		System.out.println("반:"+classNum);
		System.out.println("번호:"+num);
		System.out.println("이름:"+name);
	}
	
	/*기능:학생 성적(학년,반,번호,이름,국어,영어,수학)을 콘솔에 출력하는 메서드
	 * 매개변수:
	 * 리턴타입:void
	 * 메서드명:printScore
	 * */
	
	public void printScor() {
		printInfo();
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
	}
	/*기능:국어 성적을 수정하는 메서드
	 * 매개변수:int
	 * 리턴타입:void
	 * 메서드명:setKor
	 * */
	public  void setKor(int newKor) {
		kor=newKor;
	}
	/*기능:영어 성적을 수정하는 메서드
	 * 매개변수:int
	 * 리턴타입:void
	 * 메서드명:setEng
	 * */
	public void setEng(int newEng) {
		eng=newEng;
	}
	/*기능:수학 성적을 수정하는 메서드
	 * 매개변수:int
	 * 리턴타입:void
	 * 메서드명:setMath
	 * */
	public void setMath(int newMath) {
	math=newMath;
}
}
