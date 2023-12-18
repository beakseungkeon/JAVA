package day07;

import java.util.Scanner;

public class ArrayMethodEx1 {

	public static void main(String[] args) {
		// 1~45사이의 중복되지 않은 랜덤한 수 6개를 만드는 코드를 작성하세요
		int arr[]=new int[6];
		int min=1,max=45;
		if(creatRandomArray(min,max,arr)) {
			System.out.println("생성 성공");
			for(int tmp:arr) {
				System.out.println(tmp+" ");
			}
		}else {
			System.out.println("생성 실패");
		}
		
	}
	
	//매개변수 int min int max
	//리턴타입 :생성된 랜덤한 수=>정수=>int
	
	//메서드명:random
	public static int  random(int min,int max) {
		//두 수 바꾸기
		if(max<min) {
			int tmp=max;
			max=min;
			min=tmp;
		}
		return (int)(int)(Math.random()*(max-min+1)+min);
		
		
	}
	
	//매개변쉬:주어진 배열,검사할 배열의 개수,비교할 정수=>int [] arr,int n . int num
	//리턴타입:boolean
	//메서드명:contain
	public static boolean contains(int [] arr,int n,int num) {
		//배열 생성이 안됐거나 크기가 0이면
		if(arr==null||arr.length==0) {
			return false;
		}
		//배열의 크기보다 비교할 개수가 많으면
		if(arr.length<n) {
			n=arr.length;
		}
		for(int i=0;i<n;i++)	 {
			if(arr[i]==num){
				return true;
			}
		}
		return false;
	}
	//매개변수:최솟값,최대값,배열=>int min,int max,int[]arr
	//리턴타입:배열의 생성여부 boolean
	//메서드명creatRandomArray
	
	public static boolean creatRandomArray(int min,int max,int[]arr) {
		//max가 min보다 작은 경우
		if(arr==null||arr.length==0) {
			return false;
		}
		if(max<min) {
			int tmp=max;
			max=min;
			min=tmp;
		}
		//배열의 크기가 min max 사이의 정수의 수보다 클떄
		if(arr.length>max-min+1) {
			return false;
		}
		int count=0;
		while(count<arr.length) {
			int r=random(min,max);
			if(!contains(arr,count,r)) {
				arr[count]=r;
				count++;
			}
		}
		return true;
	}
	//1~45까지 중복되지 않은 수 6개를 입력하는 코드를 작성하세요(contains메서드 이용)
	//매개변수:배열
	//리턴 타입:boolean
	//메서드명:scan1
	
	
}
