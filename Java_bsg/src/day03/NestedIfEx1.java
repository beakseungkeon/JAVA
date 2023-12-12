package day03;

public class NestedIfEx1 {

	public static void main(String[] args) {
		//2의 배수이면 2의 배수라고 출력하고, 6의 배수이면 6의 배수라고 출력하고
		//2,6의 배수가 아니면 2,6의 배수가 아님이라고 출력하는 예제
		int num=6;
		//2의 배수 판별
		if(num%2==0) {
			if(num%3==0) {
				System.out.println(num+"은 6의 배수");
			}else {
				System.out.println(num+"2의 배수");
			}
		}else {
			System.out.println("2,6의 배수가 아님");
		}
		
		if(num%2==0&&num%3==0) {
			System.out.println(num+"은 6의 배수");
		}else if(num%2==0){
			System.out.println(num+"은 2의 배수");
		}else {
			System.out.println("2,6의 배수가 아님");
		}
	}

}
