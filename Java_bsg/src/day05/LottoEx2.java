package day05;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		// 로또 당첨 번호를 랜덤으로 생성한 후(당첨번호 6자리+ 보너스), 사용자가 로또 번호를 입력하면 (로또번호 6자리+ 보너스 번호)당첨 등수를 출력하는 코드를 작성하세요
		int lotto=0;
		int min=1,max=45;
		int arr[]=new int[7];
		int count=0;//배열에 저장된 중복되지 않은 수의 개수
		Scanner scan = new Scanner(System.in);
		int user[]=new int[6];
		
		
		boolean second=false;
		while(count<7){
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
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("보너스 번호:"+arr[6]);
		for(int i=0;i<6;i++) {
			System.out.println("로또 번호 입력:");
			user[i]=scan.nextInt();
		}
		//로또 당첨 확인
		for(int i=0;i<user.length;i++) {
			for(int j=0;j<(arr.length-1);j++) {
				if(user[i]==arr[j]) {
					lotto++;
				}
			}
		}
		//보너스 번호 확인
		for(int i=0;i<user.length;i++) {
			if(arr[6]==user[i]) {
				second=true;
			}
		}
		//등수 출력
		switch(lotto){
		case 6:System.out.println("1등 당첨");break;
		case 5:{if(second) {
			System.out.println("2등 당첨");break;
		}else System.out.println("3등 당첨");break;
			
		}
		case 4:{System.out.println("4등 당첨");break;
		}
		default:System.out.println(lotto+"개 맞추셨습니다.");
		
		
		
		

	}
	}
}
