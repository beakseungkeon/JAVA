package day05;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int min=1,max=3;
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*(max-min+1)+1);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
