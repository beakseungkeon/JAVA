package day07;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*매개변수가 기본형 변수인 경우와 참조형 변수인 경우의 차이를 보여주는 예제*/
		//매개변수가 기본 자료형이면 메서드 안에서 값이 바뀌어도 원본은 안바뀜
		//참조형은 주소를 보내기 때문에 메서드 안에서 값이 바뀌면 원본도 바뀐다.
		int num1=10,num2=20;
		System.out.println("num1:"+num1+"num2:"+num2);
		swap(num1,num2);
		System.out.println("num1:"+num1+"num2:"+num2);
		int [] arr1= {1,2,3,4,5};
		int [] arr2= {10,20,30,40,50};
		System.out.print("arr1=");
		printArray(arr1);
		System.out.print("arr2=");
		printArray(arr2);
		System.out.println();
		swap2(arr1,arr2);
		System.out.print("arr1=");
		printArray(arr1);
		System.out.print("arr2=");
		printArray(arr2);
		System.out.println();
	}
	/*기능:두 정수를 바꾸는 메서드
	 * 매개변수:두 정수
	 * 리턴타입:void
	 * 메서드명:swap1
	 * */
	public static void swap(int num1,int num2) {
		
		int tmp=num1;
		num1=num2;
		num2=tmp;
	
	}

/*두 정수배열을 바꾸는 메서드
 * 매개변수 : 바꿀 두 정수 배여ㅓㄹ
 * 리턴타입:없음
 * 메서드명:swap2*/
public static void swap2(int arr1[],int arr2[]) {
	for(int i=0;i<arr1.length;i++) {
		int tmp=arr1[i];
		arr1[i]=arr2[i];
		arr2[i]=tmp;
	}
	}
/*정수 배열을 콘솔에 한줄로 출력하는 메서드
 * 매개변수:출력하려는 정수배열
 * 리턴타입:없음
 * 메서드명:printArray*/

public static void printArray(int []arr) {
	for(int tmp:arr) {
		System.out.print(tmp+" ");
	}
}
}
