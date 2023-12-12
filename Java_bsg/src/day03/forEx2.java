package day03;

public class forEx2 {

	public static void main(String[] args) {
		/* 1에서 10사이의 짝수들의 합을 구하시오*/
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum+=i;
				
			}
		}
		System.out.println(sum);
	}

}
