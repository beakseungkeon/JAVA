package day17;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SincornizedEx1 {

	public static void main(String[] args) {
		BankBook bb=new BankBook(0,"홍길동");
		Customer c1=new Customer(bb,"홍길동");
		Customer c2=new Customer(bb,"고길동");
		
		
		c1.start();
		c2.start();
	}

}

@AllArgsConstructor
class Customer extends Thread{
	private BankBook bankBook;
	private String name;
	
	@Override
	public void run() {
		System.out.println("찾는 중 "+name);
		bankBook.deposit(10000);
	}
	
}
@Data
@AllArgsConstructor
class BankBook{
	private int balace;
	private String name;
	
	public synchronized void deposit(int money) {
		this.balace+=money;
		//2초 동안 현재 쓰레드를 일시중지
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("이름:"+this.name);
		System.out.println("잔액:"+this.balace);
	}
}