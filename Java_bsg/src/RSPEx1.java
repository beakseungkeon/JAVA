import java.util.Scanner;

public class RSPEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*다음 기능을 가진 가위,바위,보 프로그램을 작성하시오
		 * 1.새 게임
		 * 2.기록
		 * 3.프로그램 종료
		 * 
		 * 컴퓨터가 랜덤으로 내는 가위,바위,보를 비교하여 이기면 승 지면패 비기면 무로 기록
		 * 바위:R,보:P,가위:S
		 * 기록
		 * -승 무 패를 순서대로 출력*/
		Scanner scan = new Scanner(System.in);
		int record=0;
		int highscore=0;
		int num;
		int draw=0;
		int win=0;
		int lose=0;
		do {
			System.out.println();
		System.out.println("메뉴");
		System.out.println("1.새 게임");
		System.out.println("2.최고기록 확인");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴선택:");
		
		num=scan.nextInt();
		if(num==1) {
			int min=1,max=3;
			int r=(int)(Math.random()*(max-min+1)+1);
			System.out.println("가위,바위,보를 입력하세요:");
			System.out.println(r);
			int num2=scan.nextInt();
			if(r==num2) {
				System.out.println("무");
				draw++;
			}
			else if((r==1&&num2==2)||(r==2&&num2==3)||(r==3&&num2==1)) {
				System.out.println("승");
				win++;
			}
			
			else {
				System.out.println("패");
				lose++;
			}
			
			
		}
		else if(num==2) {
			System.out.println("승:"+win+"무:"+draw+"패:"+lose);
			}
		
		}while(num!=3);
		System.out.println("프로그램을 종료합니다...");
		
		
		
		
		
		scan.close();

		
	}

}
