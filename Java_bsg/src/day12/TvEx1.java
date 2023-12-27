package day12;

public class TvEx1 extends Product1 {
	public int size;

	public TvEx1(String brand, String code, String name,int size) {
		super(brand, code, name);
		this.size=size;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print() {
		System.out.println("-------------");
		System.out.println("브랜드명:"+brand);
		System.out.println("재품명:"+name);
		System.out.println("제품코드:"+code);
		System.out.println("화면크기:"+size+"cm");
	}
	
}
