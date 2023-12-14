package day05;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		// 배열 복사 예제
		int arr1[]=new int[]{1,2,3,4,5};
		int arr2[]=arr1; //복사가 아니라 공유하는 것이다.arr1의 내용이 바뀌면 arr2의 내용도 같이 바뀜
		int arr3[]=new int[arr1.length];
		int arr4[]=new int[arr1.length];
		//반복문을 이용하여 arr1에 있는 값들을 arr3에 복사
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		//
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		arr1[0]=10;
		//arr2[0]내용도 10으로 바뀜
		for(int i=0;i<=4;i++) {
			System.out.print(arr4[i]);
		}
		int num1=10;
		int num2=num1;
		num1=20;
		System.out.println(num2);
		
		int arr5[]=new int[arr1.length];
		//arr1 1번지부터 2개 복사
		System.arraycopy(arr1, 1, arr5, 0, 2);
		for(int i=0;i<=4;i++) {
			System.out.print(arr5[i]);
		}
	}

}
