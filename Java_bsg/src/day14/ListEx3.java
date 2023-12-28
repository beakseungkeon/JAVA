package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String[] args) {
		// 속담을 입력받아 저장하고 출력하는 코드를 작성하세요
		//ArrayList를 이용하여 속담을 입력받을 리스트 생성
		//문자열을 입력받기 때문에 <String>
		ArrayList<String> list=new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("속담 입력 5개:");
		int num=5;
		for(int i=0;i<num;i++) {
			String num1=scan.next();
			list.add(num1);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		

	}

}
