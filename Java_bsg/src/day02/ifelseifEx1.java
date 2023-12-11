package day02;

public class ifelseifEx1 {
	//else if문 예제
	public static void main(String[] args) {
		int num=-1;
		
		//num가 0이면 0이라 출력,num가 양수이면 양수라고 출력하고,num가 음수이면 음수라고 출력하는 코드를 작성하세요
		if(num==0) {
			System.out.println(num+"은 0입니다.");
		}
		else if(num>0) {
			System.out.println(num+"은 양수입니다.");
		}
		else {
			System.out.println(num+"은 음수입니다.");
		}

	}

}
