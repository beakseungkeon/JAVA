package day14;

import java.util.ArrayList;

public class ListEx1 {

	public static void main(String[] args) {
		//리스트는 인터페이스이기 떄문에 //인터페이스는 직접 인스턴스를 만들 수 없다.
		//List<Integer> list= new list<Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		//리스트를 이용하면 배열의 크기를 늘릴 필요가 없다.
		for(int i=0;i<100;i++) {
			list.add(i+1);
		}
		for(int i=0;i<list.size();i++) {
			//get(index) : index 번지에 있는 인스턴스를 가져옴 순서 보장
			System.out.print(list.get(i)+" ");
		}

	}

}
