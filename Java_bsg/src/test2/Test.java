package test2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Person[]pArr=new Person[3];
		
		pArr[0] = new Person( );
		pArr[1] = new Person( );
		pArr[2] = new Person( );
		
		pArr[0].name="124";
		
		for(int i=0;i<pArr.length;i++) {
			System.out.println(pArr[i].getName());
		}
	}

}
