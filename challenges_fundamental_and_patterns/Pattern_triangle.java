package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pattern_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp=n-1;
		int nst=1;
		for(int i=1;i<=n;i++)
		{
			//spaces
			for(int j=1;j<=nsp;j++)
			{
				System.out.print("\t");
			}
			//star
			int x=i;
			
			for(int j=1;j<=nst;j++)
			{
				if(j<=nst/2)
				{
					System.out.print(x+"\t");
					x++;
				}
				else
				{
					System.out.print(x+"\t");
					x--;
				}
			}
			System.out.println();
			nsp--;
			nst+=2;
		}

	}

}
