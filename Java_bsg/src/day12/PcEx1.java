package day12;

public class PcEx1 extends Product1 {
	double cpu;
	int ram;

	public PcEx1(String brand, String code, String name,double cpu,int ram) {
		super(brand, code, name);
		this.cpu=cpu;
		this.ram=ram;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("-------------");
		System.out.println("브랜드명:"+brand);
		System.out.println("재품명:"+name);
		System.out.println("제품코드:"+code);
		System.out.println("cpu:"+cpu+"GHz");
		System.out.println("ram:"+ram+"G");
	}

	
}