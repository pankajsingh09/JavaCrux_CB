package javaCrux_CB;

import java.util.Scanner;

public class HCF_GCD {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of divident ");
		int divident=sc.nextInt();
		System.out.println("Enter the value of divisor ");
		int divisor=sc.nextInt();
			int rem=0;
		while(divident%divisor!=0)
		{
			rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("The HCF/GCD is : "+divisor);
		
	}

}
