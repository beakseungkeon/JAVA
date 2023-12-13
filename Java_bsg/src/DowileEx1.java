import java.util.Scanner;

public class DowileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//q를 입력하기 전까지 문자를 입력하면 입력받은 문자를 출력하는 예제
		Scanner scan = new Scanner(System.in);
		
		char ch;
		do {
			System.out.println("입력:");
			ch=scan.next().charAt(0);
			System.out.println("문자:"+ch);
		}while(ch!='q');
		scan.close();
	}

}
