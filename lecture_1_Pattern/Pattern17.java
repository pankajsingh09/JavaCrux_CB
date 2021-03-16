package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows ");
		int n=sc.nextInt();
		int nst=n/2;
		int nsp=1;
		int row=1;
		while(row<=n)
		{
			int cst1=1;
			while(cst1<=nst)
			{
				System.out.print("*\t");
				cst1++;
			}
			
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			
			int cst2=1;
			while(cst2<=nst)
			{
				System.out.print("*\t");
				cst2++;
			}
			System.out.println();
			if(row<=n/2)
			{
				nst--;
				nsp=nsp+2;
			}
			else
			{
				nst++;
				nsp=nsp-2;
			}
			row++;
			
		}
		
		
		
	}
}
