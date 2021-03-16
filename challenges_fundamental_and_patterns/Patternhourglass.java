package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Patternhourglass {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nsp=0;
		int nst=2*n+1;
		int row=2*n+1;
		int val=n;
		
		for(int i=1;i<=row;i++)
		{
			//spaces
			for(int j=1;j<=nsp;j++)
			{
				System.out.print("\t");
			}
			
			//stars
			int x=val;
			for(int j=1;j<=nst;j++)
			{
				System.out.print(x+"\t");
				if(j<=nst/2)
				{
					x--;
				}
				else
				{
					x++;
				}
			}
			
			//preparation
			if(i<=n)
			{
				nsp++;
				nst-=2;
				val--;
			}
			else
			{
				nsp--;
				nst+=2;
				val++;
			}
			System.out.println();
		}

	}

}
