package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LottoEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤으로 당첨 번호를 생성하고, 사용자가 로또 번호를 입력하면 등수를 알려주는 코드를 작성하세요
		//단 컬렉션을 이용
		//당첨 번호는 6개 보너스 1개
		//사용자 6개
		Scanner scan = new Scanner(System.in);
		int count=0;
		int count1=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		int min =1 ,max=45;
		while(set1.size()<1) {
			Random random1=new Random();
			int tmp=random1.nextInt(max-min+1)+min;
			set1.add(tmp);
		}
		while(set.size()<6) {
			Random random=new Random();
			int tmp=random.nextInt(max-min+1)+min;
			set.add(tmp);
		}
		System.out.println(set);
		System.out.println(set1);
		System.out.println("사용자 6자리 입력:");
		for(int i=0;i<6;i++) {
		
			System.out.println("정수 입력:");
			
			int num=scan.nextInt();
			
			list.add(num);
		}
		for(int i=0;i<list.size();i++) {
			if(set.contains(list.get(i))) {
				count++;
			}
			if(set1.contains(list.get(i))) {
				count1++;
			}
		}
		System.out.println(count1);
		switch(count) {
		case 6:System.out.println("1등");
		break;
		case 5:if(count1==1) {
			System.out.println("2등");
		}else System.out.println("3등");
		break;
		case 4:System.out.println("4등");
		break;
		case 3:System.out.println("5등");
		break;
		default:System.out.println("꽝");
		}
		
		
		
	}

}
