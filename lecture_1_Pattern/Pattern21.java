package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows ");
		int n=sc.nextInt();
		int nst=1;
		int nsp=(2*n)-3 ;
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
			if(row==n)
				cst2=2;
			while(cst2<=nst)
			{
				System.out.print("*\t");
				cst2++;
			}
			System.out.println();
			nst++;
			nsp-=2;
			
			row++;
			
		}
		
		
		
	}
}
