import java.util.Scanner;

public class GcdEx1 {

	public static void main(String[] args) {
		/*정수의 약수를 출력하는 예제를 작성*/
		Scanner scan=new Scanner(System.in);
		System.out.print("정수을 입력하세요:");
		int a=0;
		a=scan.nextInt();
		System.out.print(a+"의 약수:");
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i);
				if(a!=i) {
					System.out.print(", ");
				}
				
			}
		}

	}

}
