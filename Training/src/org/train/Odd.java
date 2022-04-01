package org.train;

import java.util.Scanner;

public class Odd {
	
	public static void main(String[] args) {
		
		
		int number;
		
		Scanner n = new Scanner(System.in);
		System.out.println("enter the number");
		 number= n.nextInt();
		
		if(number/2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		
	}

}
