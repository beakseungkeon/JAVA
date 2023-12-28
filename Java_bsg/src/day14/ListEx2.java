package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		//정수를 입력받아 입력받은 정수를 리스트에 저장하는 코드를 작성하세여
		//콘솔창에서 다양한 값을 입력받기 위한 Scanner 인스턴스를 생성
		//콘솔창에서 입력받아야 하기 때문에 표준 입력이 System.in 인스턴스를 전달
		Scanner scan = new Scanner(System.in);
		//정수를 여러개 저장하기 위해 ArrayList 인스턴스를 생성
		//정수이기 때문에 <Integer>추가 int가 안되는 이유는 제네릭은 클래스만 올 수 있어서 
		ArrayList<Integer> list=new ArrayList<Integer>();
		//정수 5개를 받기 위해 5번 반복문 만들기
		for(int i=0;i<5;i++) {
			//System에 있는 out 인스턴스에서 제공하는 print 메서드를 이용하여 콘솔창에 문자열을 출력
			System.out.println("정수 입력:");
			//변수 선언하고 입력받기
			//scan.nextInt()를 통해 입력 버퍼에 있는 값 중 정수 값을 가져옴
			//만약 입력 버퍼에 정수가 아닌 문자나 문자열이 있으면 예외가 발생
			//가져온 정수를 num에 저장
			int num=scan.nextInt();
			//Collection에서 제공하는 add 메서드를 이용하여 리스트에 정수값을 추가
			//int인 tmp가 Integer로 박싱이 되면서 리스트에 추가
			list.add(num);
		}
		//리스트 출력
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
