package day05;

public class RandomArrayEx2 {

	public static void main(String[] args) {
		// 1~9 사이의 중복되지 않은 랜검한 수 3개를 저장하는 예제
		int min=1,max=9;
		int arr[]=new int[3];
		int count=0;//배열에 저장된 중복되지 않은 수의 개수
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
		for(int i=0;i<arr.length;i++) {
			syso
		}
	}

}
