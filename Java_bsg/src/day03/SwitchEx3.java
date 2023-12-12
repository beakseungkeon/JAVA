package day03;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3,4,5 :봄
		 * 6,7,8:여름
		 * 9,10,11:가을
		 * 12,1,2:겨울*/
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요:");
		int month=scan.nextInt();
		
		switch(month) {
		case 3,4,5://최신 버전에서 가능
			System.out.println(month+"월은 봄입니다.");
			break;
		
		case 6,7,8:
			System.out.println(month+"월은 여름입니다.");
			break;
		case 9,10,11:
			System.out.println(month+"월은 가을입니다.");
			break;
		case 1,2,12:
			System.out.println(month+"월은 겨울입니다.");
			break;
		default:System.out.println("잘못된 입력입니다.");
	}
		scan.close();
	}

}
