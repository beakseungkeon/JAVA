package day03;

public class WhileSumEx1 {

	public static void main(String[] args) {
		// 1부터 5까지의 합을 구하는 코드를 작성
		
		int i=1;
		int total=0;
		while(i<=5) {
			total+=i;
			i++;
		}
		System.out.println("1부터 5까지의 합은"+total);
		
	}

}
