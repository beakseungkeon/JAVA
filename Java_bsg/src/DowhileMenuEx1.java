import java.util.Scanner;

public class DowhileMenuEx1 {

	public static void main(String[] args) {
		/*메뉴를 추력하는 예제*/
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("메뉴");
			System.out.println("1.새 게임");
			System.out.println("2.최고기록 확인");
			System.out.println("3.프로그램 종료");
			System.out.print("메뉴선택:");
			num=scan.nextInt();
			
		}while(num!=3);
		System.out.println("프로그램을 종료합니다.");
		scan.close();

	}

}
