package day03;

public class SwitchEx1 {
	//switch문 예제
	public static void main(String[] args) {
		/*정수가 0인지 아닌지 판별하는 예제*/
		int num=2;
		switch(num) {
		case 0:
			System.out.println("0입니다");
			break;
		default:System.out.println(num+"은 0이 아닙니다.");
		}

	}

}
