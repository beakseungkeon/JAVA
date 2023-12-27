package day12;

import java.util.Scanner;

public class ProductMain {
	static Scanner scan = new Scanner(System.in);
	static Product1[] list =new Product1[30];
	static int count=0;
	public static void main(String[] args) {
		/* 제품을 추가하는 프로그램을 작성하세요
		제품은 TV,에어컨,컴퓨터만 추가 가능
		메뉴
		1.제품 추가
		2.제품 확인
		3.종료
		메뉴 선택:1
		------------
		추가할 제품
		1.TV
		2.에어컨
		3.컴퓨터
		제품 선택:1
		브랜드:삼성
		제품코드:
		제품명:
		화면크기(cm):
		등록이 완료됐습니다.
		-----------------
		1.제품 추가
		2.제품 확인
		3.종료
		메뉴 선택:1
			------------
		추가할 제품
		1.TV
		2.에어컨
		3.컴퓨터
		제품 선택:2
		브랜드:삼성
		제품코드:
		제품명:
		냉방면적(m2):
		
		

		*/
		int menu;
		do {
			menu();
			menu=scan.nextInt();
			runMenu(menu);
			
			
		}while(menu!=3);
		
		
	}
public static void menu() {
	System.out.println("메뉴");
	System.out.println("1.제품 추가");
	System.out.println("2.제품 확인");
	System.out.println("3.프로그램 종료");
	System.out.print("메뉴 선택:");
	
	}
public static void runMenu(int menu) {
	switch(menu){
		case 1:
			insertProduct();
			break;
		case 2:
			printProduct();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			
		}
	}
	public static void insertProduct() {
		printProductTitle();
		int select=scan.nextInt();
		System.out.println("브랜드:");
		
		String brand=scan.nextLine();
		System.out.println("제품명:");
		
		String name=scan.nextLine();
		System.out.println("제품코드:");
		String code=scan.next();
		switch(select) {
		case 1:
			System.out.println("화면크기:");
			int size=scan.nextInt();
			list[count++]=new TvEx1(brand,code,name,size);
			break;
		case 2:
			System.out.println("냉방면적:");
			double area=scan.nextDouble();
			list[count++]=new AirconEx1(brand,code,name,area);
			break;
		case 3:System.out.println("cpu:");
			double cpu=scan.nextDouble();
			System.out.println("ram:");
			int ram=scan.nextInt();
			list[count++]=new PcEx1(brand,code,name,cpu,ram);
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
		
	}
	public static void printProductTitle() {
		// TODO Auto-generated method stub
		System.out.println("제품등록");
		System.out.println("1.TV");
		System.out.println("2.에어컨");
		System.out.println("1.PC");
		System.out.println("제품선택:");
		
	}
	public static void printProduct() {
		// TODO Auto-generated method stub
		if(count==0) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		for(int i=0; i<count;i++) {
			list[i].print();
		}
		
	}

}
