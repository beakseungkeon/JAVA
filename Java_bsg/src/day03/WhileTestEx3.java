package day03;

public class WhileTestEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1에서 10 사이에 짝수를 모두 출력하는 코드 작성*/
		int i=2;
		
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		i=2;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
				i++;
			}
			i++;
		}
		i=1;
		while(i<=5) {
			System.out.println(i*2);
			i++;
		}
	}

}
