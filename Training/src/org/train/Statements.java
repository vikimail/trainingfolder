package org.train;

import java.util.Scanner;

public class Statements {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("enter the age");
		int a1=a.nextInt();
		
		if( a1>18) {
			System.out.println("eligible to vote");
		}else {
				System.out.println("not eligible to vote");
			}
			
		}
	}


