package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of rows : ");
			int n=sc.nextInt();
			
			// using for loop
		
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print("\t");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*\t");
				}
				System.out.println();
			
			}
			
			
			//using while loop
			/*
			int row =1;
			int nst=n-1;
			
			while(row<=n)
			{
				int cst=1;
				while(cst<=nst)
				{
					System.out.print("\t");
					cst++;
				}
				int j=1;
				while(j<=row)
				{
					System.out.print("*\t");
					j++;
				}
				System.out.println();
				row++;
				nst--;
			}
			*/
			
	}

}
