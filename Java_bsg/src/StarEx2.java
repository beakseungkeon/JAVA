
public class StarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=1;
		int d=0;
		for(int i=0;i<5;i++) {
			for(int c=4;c>=d;c--) {
				System.out.print(" ");
			}
			for(int a=1;a<=b;a++) {
				System.out.print("*");
			}
			d+=1;
			b+=2;
			System.out.println();
		}
	}

}
