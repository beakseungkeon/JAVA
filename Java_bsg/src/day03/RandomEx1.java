package day03;

public class RandomEx1 {

	public static void main(String[] args) {
		//min ~max 사이에 랜덤한 수를 생성하는 예제
		//Math.random()은 0부터 1미만의 랜덤한 실수를 만들어줌
		int min=1,max=10;
		int r=(int)(Math.random()*(max-min+1)+1);
		System.out.println(r);

	}

}
