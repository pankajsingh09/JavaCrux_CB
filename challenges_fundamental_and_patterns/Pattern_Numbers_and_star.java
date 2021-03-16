package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pattern_Numbers_and_star {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		int nst1=n;
		int nst2=-1;
		
		for(int i=1;i<=n;i++)
		{
			//Numbers
			for(int j=1;j<=nst1;j++)
			{
				System.out.print(j+" ");
			}
			
			//stars
			for(int j=1;j<=nst2;j++)
			{
				System.out.print("* ");
			}
			
			//preparation
			System.out.println();
			nst1--;
			nst2+=2;
		}

	}

}
