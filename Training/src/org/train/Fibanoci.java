package org.train;

import java.util.Scanner;

public class Fibanoci {
	
	public static void main(String[] args) {
		
		
		int term, a=0,b=1,c;
		System.out.println("enter a term");
		Scanner p = new Scanner(System.in);
		term=p.nextInt();
		for(int i = 1;i<=term;i++) {
			
			System.out.println(a+"");
			
			c=a+b;
			a=b;
			b=c;
		}
	}

}
