package day04;

public class PrimenumberEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2부터 100사이의 모든 소수를 출력하는 코드를 작성하세요
		int a=0;
		System.out.print("1부터 100사이의 소수:");
		for(int num=2;num<=100;num++) {
			a=0;
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				a+=1;
			}
			
			
		}
		if(a==2) {
			System.out.print(num+" ");
			
			}
		
		}
	}
}
