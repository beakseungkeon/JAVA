package day12;

public class AirconEx1 extends Product1 {
	private double area;

	public AirconEx1(String brand, String code, String name,double area) {
		super(brand, code, name);
		this.area=area;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("-------------");
		System.out.println("브랜드명:"+brand);
		System.out.println("재품명:"+name);
		System.out.println("제품코드:"+code);
		System.out.println("냉방면적:"+area+"m2");
	}

	
}