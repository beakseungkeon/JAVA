package day08;

import java.util.Scanner;

public class carMain {

	public static void main(String[] args) {
	
		
		//Scanner:클래스명
		//scan:인스턴스명
		//Scanner(System.in):표준 입력을 이용하여 초기화 하는 생성자
		
		Car car = new Car();
		car.turn();
		car.print();
		car.turnLight(-1);
		car.print();
		car.turnLight(1);
		car.print();
		for(int i=0;i<10;i++) {
			car.speedUp();
		}
		car.print();
	}

}
