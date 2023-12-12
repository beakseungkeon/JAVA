package day03;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {

/*구구단 2단을 출력하는 코드를 작성하세요
 * */
		int i=1;
		int z=1;
		while(i<=9) {
			while(z<=9) {
				System.out.println(i+"x"+z+"="+i*z);
				z++;
			}
			z=1;
			i++;
		}
	}
}
