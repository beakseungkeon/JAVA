package day02;

public class ifelseEx1 {

	public static void main(String[] args) {
		
		int num1=10;
		if(num1==0) {
			System.out.println("0임");;
		}
		//if를 두번쓰면 무조건 2번 확인
		//if else를 쓰면 num가 0이면 1번확인,num가 0이 아니면 2번 확인
		else {
			System.out.println(num1+"은 0이 아님");
		}
	}

}
