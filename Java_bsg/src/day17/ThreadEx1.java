package day17;

public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//싱글 스레드 -출력후 +출력
		for(int i=0;i<1000;i++) {
			System.out.print("-");
		}
		for(int i=0;i<1000;i++) {
			System.out.print("+");
		}
		System.out.println();
		Thread1 t1=new Thread1();
		t1.start();
		Thread t2=new Thread(new Thread2());
		t2.start();
		
	}

}
//멀티 스레드로 스레드1은 - 출력 스레드2는 +출력 번갈아 실행
class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("-");
		}
	}
	
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<1000;i++) {
			System.out.print("+");
		}
	}
	
}