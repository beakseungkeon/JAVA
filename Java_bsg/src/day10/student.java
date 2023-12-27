package day10;

public class student {
//학년,반,번호,이름
	private int grade,classNum,num;
	private String name;
	
//성적
	private subject[] subjects;
	private int count=0;//등록된 과목 수
	//getter setter

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public subject[] getSubjects() {
		return subjects;
	}

	public void setSubjects(subject[] subjects) {
		this.subjects = subjects;
	}
	//과목 추가하는 메서드
	public boolean insertSubject(String title,int score) {
		for(subject tmp : subjects) {
			//과목 인스턴스가 있고,과목의 제목과 추가하려는 제목이 같으면
			if(tmp!=null&&tmp.equals(title)) {
				return false;
			}
		}
		subjects[count]=new subject(title,score);
		count++;
		expandSubject();
		return true;
	}
	private void expandSubject() {
		if(subjects.length>count) {
			return;
		}
		subject[] tmpList=new subject[subjects.length+5];
		System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
	}
	
	
	//과목 삭제하는 메서드
	public boolean deleteSubject(String title) {
		//삭제할 과목이 어디있는지 확인하기 위한 변수로,번지이기 때문에 -1이면 없음,0이상이면 있음
		int index=-1;
		for(int i=0;i<count;i++) {
			if(subjects[i].equals(title)) {
				index=i;
			}
		}
		if(index==-1) {
			return false;
		}
		count--;
		//삭제된 항목이 마지막 항목이면
		if(index==count-1) {
			//추가할 때 향상된 for문을 이용하기 때문에 삭제된 항목을 null로 수정해야함
			subjects[index]=null;
			return true;
		}
		subject []tmpList = new subject[subjects.length];
		//기준 과목 전체 복사
		System.arraycopy(subjects, 0, tmpList, 0, subjects.length);
		//앞으로 당겨주기
		System.arraycopy(tmpList, index+1, subjects, index, count-index);
		subjects[index]=null;
		return true;
	}
	//성적 수정하는 메서드
	public boolean updateSubject(String title,int socre) {
		for(subject tmp:subjects) {
			if(tmp!=null&&tmp.equals(title)) {
				tmp.updateScore(socre);
				return true;
			}
		}
		return false;
	}
	//학생정보 출력 메서드
	public void print() {
		System.out.println(grade+"학년"+classNum+"반"+num+"번"+name);
		for(subject tmp : subjects) {
			if(tmp!=null) {
				tmp.print();
			}
		}
	}

	public student(int grade, int classNum, int num, String name) {
		
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		subjects =new subject[5];
	}
	
	
}
