package day12;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		// 다형성 예제
		//1. 매개변수의 다형성
		Remocon r= new Remocon();
		Tv tv=new Tv();
		AirConditioner aircon=new AirConditioner();
		r.turnOn(tv);
		r.turnOn(aircon);
		Projector projector= new Projector();
		r.turnOn(projector);
	}

}
class Remocon{
	/*
	void turnOn(Tv target) {
		System.out.println("제품이 켜졌습니다.");
	}
	void turnOn(AirConditioner target) {
		System.out.println("제품이 켜졌습니다.");
	}*/
	void turnOn(ElectronicProduct target) {
		System.out.println("제품이 켜졌습니다.");
	}
}

class ElectronicProduct{
	
}
class Tv extends ElectronicProduct{
	
}
class AirConditioner extends ElectronicProduct{
	
}
class Projector extends ElectronicProduct{
	
}