package javaCrux_CB;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no :");
		int n=sc.nextInt();
		int b=0;
		while(n!=0)
		{
			int c=n%10;
			b=b*10+c;
			n=n/10;
			}
		System.out.println("The reversed no is :"+b);
		
	}

}
