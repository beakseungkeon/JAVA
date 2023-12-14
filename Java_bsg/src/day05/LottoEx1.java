package day05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1에서 45 사이에 랜덤한 수 6개를 생성하여 출력하는 예제*/
		int min=1,max=45;
		int arr[]=new int[6];
		int count=0;//배열에 저장된 중복되지 않은 수의 개수
		while(count<6){
			//랜덤수 생성
			int r=(int)(Math.random()*(max-min+1)+1);
			//중복 확인
			boolean duplicated=false;//중복 여부를 알려주는 변수
			for(int i=0;i<count;i++) {
				if(arr[i]==r) {
					duplicated=true;
					break;
				}
			}
			//중복되지 않으면 저장 후 count 증가
			if(!duplicated) {
				arr[count]=r;
				count++;
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			
	}

}
