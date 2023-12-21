package day09.board;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch문 안에 지역 변수를 선언하는 경우 발생할 수 있는 문제점
		
		for(int i=0;i<5;i++) {
			System.out.println(i+"");
		}
		for(int i=0;i<5;i++) {
			System.out.println(i+"");
		}
		for(int i=0;i<5;i++) {
			System.out.println(i+"");
		}
		//
		int menu=1;
		switch(menu) {
		case 1:
			int num=10;
			System.out.println(num);
			break;
		case 2:int num=10;
		System.out.println(num);
			break;
		
		}

	}

}
