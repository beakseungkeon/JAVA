package day05;
import java.util.Scanner;

public class ArrayScoreEx1 {

	public static void main(String[] args) {
		// 학생 5명의 국어 성적을 입력받고, 총점과 평균을 구하는 코드를 작성하세요
		Scanner scan = new Scanner(System.in);
		int score[]=new int[5];
		int total=0;
		float avr=0;
		for(int i=0;i<=4;i++) {
			System.out.println("학생"+(i+1)+"성적:");
			score[i]=scan.nextInt();
			total+=score[i];
		}
		avr=total/5;
		System.out.println("총합:"+total+"평균:"+avr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
