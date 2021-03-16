package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows ");
		int n=sc.nextInt();
		
		//using for loop
		/*
		for(int i=1;i<(2*n);i++)
		{
			
			//for upper stars
			if(i<n)
			{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*\t");
			}
			}
			
			// for mid stars
			if(i==5)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("*\t");
				}
			}
			
			//for lower stars
			if(i>n)
			{
				for(int k=1;k<=(2*n)-i;k++)
				{
					System.out.print("*\t");
				}
			}
			
			System.out.println();
		}
			*/
		
		// Using While loop
		/*
		int nst=1;
		int row=1;
		while(row<(2*n))
		{
			if(row<n)
			{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*\t");
				cst++;
			}
			}
			
			if(row==n)
			{
				int i=1;
				while(i<=n)
				{
					System.out.print("*\t");
					i++;
				}
			}
			
			if(row>n)
			{
				int cst=1;
				while(cst<=(2*n)-row)
				{
					System.out.print("*\t");
					cst++;
				}
			}
			System.out.println();
			nst++;
			row++;
			
		}
		*/
		
		//Better with for loop
		
		int nst=1;
		for(int row=1;row<(2*n);row++)
		{
			//work for stars
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print("*\t");
			}
			 // preparation
			System.out.println();
			if(row<n)
			  nst++;
			else
			     nst--;
			}
		
		//Better with while loop
		/*
		int nst=1;
		int row=1;
		while(row<(2*n))
		{
			//work for stars
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*\t");
				cst++;
			}
			
		    // preparation
			System.out.println();
			if(row<n)
			nst++;
			else
				nst--;
			row++;
			
		}
		*/
	}

}
