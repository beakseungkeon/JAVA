import java.util.Scanner;

public class UpdowngameEx1 {

	public static void main(String[] args) {
		/*업다운 게임 구현
		 * 다음과 같은 메뉴를 가져야 합니다.
		 * 1.새 게임
		 * 2.최고기록 확인
		 * 3.프로그램 종료
		 * 
		 * 새 게임은 업다운 게임 시작
		 * -랜덤으로 생성된 수를 맞추는 게임
		 * 맞췄을 떄 맞춘 회수를 출력하고 메뉴로 돌아감
		 * 최고기록 확인 업다운 게임을 하면서 맞춘 횟수중 가장 적은 횟수를 알려줌
		 * 프로그램 종료.
		 * */
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		int record=0;
		int highscore=0;
		int num;
		do {
			System.out.println();
		System.out.println("메뉴");
		System.out.println("1.새 게임");
		System.out.println("2.최고기록 확인");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴선택:");
		
		num=scan.nextInt();
		if(num==1) {
			int min=1,max=100;
			int r=(int)(Math.random()*(max-min+1)+1);
			System.out.print("정수를 입력하세요");
			for(num=0 ; num!=r; ) {
				
				num=scan.nextInt();
				System.out.println("정수:"+num);
				if(num>r) {
					System.out.println("DOWN");
				}
				else System.out.println("UP");
				
				record++;
			
				
			}
			if(record<=highscore) {
				highscore=record;
				
			}
			
			System.out.println("기록:"+record);
			record=0;
			
		}
			else if(num==2) {
				System.out.println("최고기록:"+highscore);
			}
		
		}while(num!=3);
		System.out.println("프로그램을 종료합니다...");
		
		
		
		
		
		scan.close();

		

	}

}
