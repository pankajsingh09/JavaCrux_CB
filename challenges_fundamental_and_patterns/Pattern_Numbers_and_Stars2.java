package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pattern_Numbers_and_Stars2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		int nsp=n-1;
		
		for(int i=1;i<=n;i++)
		{
			//numbers
			for(int j=1;j<=nst;j++)
			{
				System.out.print(j);
			}
			
			//Stars
			for(int j=1;j<=nsp;j++)
			{
				System.out.print("*");
			}
			
			//preparation
			nst++;
			nsp--;
			System.out.println();
		}

	}

}
