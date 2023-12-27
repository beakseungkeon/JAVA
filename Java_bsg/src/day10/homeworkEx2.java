package day10;

public class homeworkEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아이디와 비번이 없는 인스턴스 생성
		Member mem1=new Member();
		mem1.print();
		//아이디와 비번이 없는 인스턴스라서 false가 나옴
		System.out.println(mem1.equals("abc","def"));
		Member mem2=new Member("abc","def","abc@naver.com");
		mem2.print();
		System.out.println(mem2.equals("abc","def"));
	}
}
class Member{
	//맴버변수:아이디,비번,이메일
	private String id,pw,email;


	
	//getter,setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//equals:아이디,비번이 주어진면 내 정보와 같은지 다른지 알려주는 메서드 
	public boolean equals(String id,String pw) {
		//아이디가 없으면
		if(this.id==null) {
			return false;
		}
		//비번이 없으면
		if(this.id==null) {
			return false;
		}
		//아이디와 비번이 일치하면
		//예외처리를 안하면 변수가 null이라서 this 사용이 불가능해 오류가 나온다
		if(this.id.equals(id)&&this.id.equals(pw)) {
			return true;
		}
		return false;
	}
	//회원 정보를 출력하는 메서드
	public void print() {
		System.out.println("아이디:"+id);
		System.out.println("이메일:"+email);
		System.out.println("비밀번호:"+pw);
	}
	//생성자:기본생성자,아이디,비번,이메일이 필요한 생성자,아이디,비번이 필요한 생성자
	public Member() {}

	public Member(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	
}
