package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Hollow_rohmbus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp=(2*n)-1;
		int nst=n;
		for(int i=1;i<=n;i++)
		{
			//space
			for(int j=1;j<=nsp;j++)
			{
				if(i==1 && j>=n || (i==n && j<=n) )
					System.out.print("*\t");
				else if((i>1 && i<n)&&(j==nst || j==nsp))
				{
					System.out.print("*\t");
				}
				else
					System.out.print("\t");
					
			}
			
			System.out.println();
			nsp--;
			nst--;
			
		}

	}

}
