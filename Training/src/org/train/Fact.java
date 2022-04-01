package org.train;
//to find factorial numbers
import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		
	
	
	//5----->120(5*4*3*2*1)
	
	
	int n=4,fact=1;
	Scanner r = new Scanner(System.in);
	System.out.println("enter any number");
	n=r.nextInt();
	for (int i=1;i<=n;i++) {
		fact= fact*i;
		
	}
	System.out.println("factorial"+fact);
		

}
}