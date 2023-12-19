package day08;

public class Car {
/*정보:맴버변수
 * 무게:단위는 톤으로,브랜드,차종,색상,바퀴
 * 
 * 기능:메서드
 * 가속 감속 시동켜기/끄기
 * 죄측 우측 깜밖이 켜기/끄기
 */
	double weight;
	String brand;
	String color;
	boolean power;//시동
	int speed;//현재 속력
	boolean LeftLight;//왼쪽 깜빡이
	boolean RightLight;//오른쪽 깜빡이
	
	//시동을 켜기
	//시동을 끄기
	//시동이 꺼져있으면 켜짐 시동이 켜져있으면 꺼짐
	public void turn() {
		power= !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
			}
		else {
				System.out.println("시동이 꺼졌습니다.");
			}
		
	}
	//가속
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		speed--;
	}
	//좌측 우측 깜빡이 켜기/끄기 위:우측1,가운데:꺼짐0,아래:좌측-1
	public void turnLight(int direction) {
		switch(direction) {
		case 1: RightLight=true; LeftLight=false; break;
		case 0:	RightLight=false; LeftLight=false; break;
		case -1:RightLight=false; LeftLight=true; break;
			
		}
	}
	//자동차 현재 상태를 출력하는 메서드
	public void print() {
		System.out.println("-----------------------");
		System.out.println("시동:"+power);
		System.out.println("속력:"+speed);
		System.out.println("좌깜:"+LeftLight);
		System.out.println("우깜:"+RightLight);
	}
}
