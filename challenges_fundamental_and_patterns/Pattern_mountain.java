package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pattern_mountain {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int nst1=1;
		int nsp=2*n-3;
		int nst2=1;
		
		for(int i=1;i<=n;i++)
		{
			//star
			for(int j=1;j<=nst1;j++)
			{
				System.out.print(j+" \t");
			}
			//space
			for(int j=1;j<=nsp;j++)
			{
				System.out.print(" \t");
			}
			//star
			int x=i;
			int j=1;
			if(i==n) {
				j=2;
				x--;
			}
			for(;j<=nst2;j++)
			{
				System.out.print(x+" \t");
				x--;
			}
			
			//preparation
			System.out.println();
			nst1++;
			nst2++;
			nsp-=2;
		}

	}

}
