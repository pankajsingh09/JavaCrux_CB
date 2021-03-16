package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int n=sc.nextInt();
		
		//using for loop
		
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("0");
			}
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		// using while loop
		
		int nst=n;
		int nsp=0;
		int row=1;
		while(row<=n)
		{
			//	for spaces
			int cns=1;
			while(cns<=nsp)
			{
				System.out.print("\t");
				cns++;
			}
			
			//	for stars
			
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*\t");
				cst++;
			}
			System.out.println();
			row++;
			nst--;
			nsp++;
		}
		
	}

}
