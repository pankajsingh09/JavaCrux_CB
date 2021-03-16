package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows ");
		int n=sc.nextInt();
		int nst=n/2;
		int nsp=1;
		int row=1;
		while(row<=n)
		{
			for(int cst1=1;cst1<=nst;cst1++)
			{
				System.out.print("\t");
			}
			
			for(int csp=1;csp<=nsp;csp++)
			{
				System.out.print("*\t");
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
