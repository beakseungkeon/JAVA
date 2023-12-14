package day05;

public class ArrayInitEx1 {

	public static void main(String[] args) {
		// aar1배열에는 0번지부터 4번지까지 모두 0으로 초기화가 됨
		//char는 \0,정수는0, 실수는0.0,boolean는 false
		int arr1[]=new int[5];
		//arr2는 0번지에 1,1번지에 2...저장
		//arr2는 총 5개의 크기를 가진 배열이됨
		int arr2[]=new int[] {1,2,3,4,5};
		arr2= new int[]{1,2,3,4,5};
		//arr2와 같은 값으로 초기화
		//arr3와 같이 초기화 하는 경우 배열을 선언과 동시에 초기화 하는 경우에만 가능
		int arr3[]= {1,2,3,4,5};
		
		//arr3= {1,2,3,4,5};//에러 발생
		
	}

}
