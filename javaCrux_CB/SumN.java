package javaCrux_CB;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the no ");
		int n=sc.nextInt();
		int sum=0;
		int c=1;
		while(c<=n)
		{
			sum+=c;
			c++;
		}
		System.out.println("The sum of first "+n+" natual no is :"+sum);
			
	}

}
