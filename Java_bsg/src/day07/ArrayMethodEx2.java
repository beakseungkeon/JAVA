package day07;

public class ArrayMethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1=new int [5];
		printArray(arr1);
		initArray1(arr1);
		
		int [] arr2=new int [5];
		printArray(arr2);
		initArray2(arr2);
		int [] arr3=new int [5];
		printArray(arr3);
		initArray1(arr3);
	}
/*기능:배열에 1부터 순차적으로 저장하는 메서드 잘못된 예시
 * 매개변수:정수배열
 * 리턴타입:없음
 * 메서드명:initArray1
 * 
 * */
	public static void printArray(int arr[]) {
		for(int tmp:arr) {
			System.out.println(tmp+" ");
		}
		System.out.println();
	}
public static void initArray1(int arr[]) {
	//새로 만들면 연결이 끊김
	arr=new int[10];
	for(int i=0;i<arr.length;i++) {
		arr[i]+=1;
	}
}
/*기능:배열에 1부터 순차적으로 저장하는 메서드 올바른 메서드
 * 매개변수:정수배열
 * 리턴타입:없음
 * 메서드명:initArray2
 * 
 * */


public static void initArray2(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		arr[i]+=1;
	}
}
/*기능:정수가 주어지면 정수 크기에 배열을 생성하고배열에 1부터 순차적으로 저장하여 만들어진 배열을 알려주는 메서드 메서드 다른 메서드
 * 매개변수:정수=>int length
 * 리턴타입:정수=>int []
 * 메서드명:initArray3
 * 
 * */
public static int[] initArray3(int length) {
	int arr[]= new int[length];
	for(int i=0;i<length;i++) {
		arr[i]=i+1;
	}
	return arr;
}
}
