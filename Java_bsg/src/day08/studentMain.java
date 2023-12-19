package day08;

import java.util.Scanner;

public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student std =new student();
		std.grade=1;
		std.classNum=1;
		std.num=1;
		std.name="홍길동";
		std.printInfo();
		std.setKor(90);
		std.setEng(100);
		std.setMath(80);
		std.printScor();
	}

}