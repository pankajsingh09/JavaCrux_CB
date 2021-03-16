package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		for(int i=1;i<=n;i++)
		{
			//Stars
			for(int j=1;j<=nst;j++)
			{
				if(j==1 || j==nst)
				{
					System.out.print("1\t");
				}
				else
				System.out.print("*\t");
			}
			//preparation
			System.out.println();
			nst++;
		}

	}

}
