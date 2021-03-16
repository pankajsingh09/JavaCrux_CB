package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pattern_inverted_Housrglass {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n=sc.nextInt();
		int nsp=2*n-1;
		int nst=1;
		int x=n;
		int val=1;
		//row
		int row=1;
		
		while(row<=(2*n)+1)
		{
			//stars
			int y=x;
			for(int i=1;i<=nst;i++)
			{
				System.out.print(y+" ");
				y--;
			}
			
			//spaces
			for(int i=1;i<=nsp;i++)
			{
				System.out.print("  ");
			}
			
			//stars
			int i=1;
			int a=val;
			if(row==n+1)
			{
				i=2;
				a+=2;
			}
			else
			{
				i=1;
				a++;
			}
			
			for(;i<=nst;i++)
			{
				System.out.print(a+" ");
				a++;
			}
			
			//preparation
			System.out.println();
			
			if(row<=n)
			{
				nst++;
				nsp-=2;
			}
			else
			{
				nst--;
				nsp+=2;
			}
			row++;
		}
	
	}

}
