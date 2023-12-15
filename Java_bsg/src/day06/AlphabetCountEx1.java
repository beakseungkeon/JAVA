package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		// 단어를 입력받아 해당하는 단어의 알파벳 갯수
		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		String str=scan.next();
		
		char alpha[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int arr[]=new int[26];
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<26;j++)
			if(str.charAt(i)==alpha['a'+j]) {
				arr[j]++;
			}
		}
		for(int i=0;i<26;i++) {
			
			if(arr[i]!=0) {
				System.out.println(alpha[i]+":"+arr[i]);}
			
		}
		
	}	
}
