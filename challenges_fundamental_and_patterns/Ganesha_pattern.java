package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Ganesha_pattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=n/2)
				{
					if(i==1 && j>(n/2)+1)
					{
						System.out.print("0\t");
					}
				else if(j==1 || j==n/2+1)
					{
						System.out.print("0\t");
					}
					else
						System.out.print("\t");
					
				}
				else if(i==(n/2)+1)
				{
					System.out.print("0\t");
				}
				else
				{
					if(i==n && j<=(n/2))
					{
						System.out.print("0\t");
					}
					else if(j==(n/2)+1 || j==n)
					{
						System.out.print("0\t");
					}
					else
					{
						System.out.print("\t");
					}
				}
				
			}
			System.out.println();
		}

	}

}
