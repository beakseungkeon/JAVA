package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하세요.
		 * - 기록은 최대 5개. 이전 기록은 삭제
		 * - 1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * - S : 숫자가 있고, 위치가 같은 경우
		 * - B : 숫자가 있지만 위치가 다른 경우
		 * - O : 일치하는 수자가 하나도 없는 경우
		 * - 3S가 되면 게임이 종료
		 * 
		 * 메뉴
		 * 1. 새게임
		 * 2. 기록확인
		 * 3. 프로그램 종료
		 * 메뉴 선택 : 1
		 * 
		 * (랜덤으로 생성된 숫자 : 3 9 1)
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 4 5 6
		 * 결과 : O
		 * 입력 : 7 9 8
		 * 결과 : 1S
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다.
		 * 도전 횟수 : 5
		 * 현재 1등입니다. 이름을 기록하세요.
		 * 이름 : JIK
		 * 
		 * 메뉴
		 * 1. 새게임
		 * 2. 기록확인
		 * 3. 프로그램 종료
		 * 메뉴 선택 : 2
		 * --기록--
		 * 1. JIK : 5회
		 */
		int re=0;
		char name[]=new char[3];
		Scanner scan = new Scanner(System.in);
		int scount=0;
		int bcount=0;
		int record=0;
		//1에서 9사이 3개 랜덤 생성 (배열 사용)
		int score=0;
		int input[]=new int[3];
		int min=1,max=9;
		int arr[]=new int[3];
		int count=0;
		int num=0;
		int toprecord[]=new int[1];
		String toprecord2[]=new String[1];
		
		do {
			System.out.println();
		System.out.println("메뉴");
		System.out.println("1.새 게임");
		System.out.println("2.기록확인");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴선택:");
		num=scan.nextInt();
		if(num==1) {
			while(count<3){
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
			
			//입력: 3개
			while(true) {
			for(int i=0;i<input.length;i++) { 
				System.out.println("입력:");
				input[i]=scan.nextInt();
			}
			for(int i=0;i<input.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[j]==input[i]) {
						bcount++;
						System.out.println("처음 볼"+bcount);
						if(arr[j]==input[j]) {
							
							bcount--;
							scount++;
							System.out.println("나중 볼"+bcount);
						}
					}
				}
			}
			if(bcount==0&&scount==0) {
				System.out.println("O");
				record++;
			}else {
				System.out.println(scount+"S"+bcount+"b");
				record++;
			}
		
			//결과: 2B
			if(scount==3) {
				
				System.out.println("정답입니다.");
				record++;
				System.out.println("현재 기록:"+record);
				
					
				System.out.println("이름을 입력하세요:");
				toprecord2[re]=scan.next();
				if(score+1>toprecord2.length) {
					int tmp2[]=new int[toprecord2.length+1];
					System.arraycopy(toprecord2, 0, tmp2, 0, toprecord2.length);
					toprecord=tmp2;
					
					}
				if(score+1>toprecord.length) {
					int tmp[]=new int[toprecord2.length+1];
					System.arraycopy(toprecord, 0, tmp, 0, toprecord.length);
					toprecord=tmp;
					score++;
					}
					
				re++;
				
				break;
				}
			scount=0;
			bcount=0;
			}
			
			//3s 게임 종료
			}
		
		else if(num==2) {
			Arrays.sort(toprecord);
			
			for(int i=0;i<toprecord.length;i++) {
				System.out.println(toprecord[i]+":"+toprecord[i]);
			}
				}
		
		}while(num!=3);
		// --------------------------------------------------------------------------------------------
		
		

	}

}
