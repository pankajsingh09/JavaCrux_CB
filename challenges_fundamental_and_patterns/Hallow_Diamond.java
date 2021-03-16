package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Hallow_Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{	
			
				 if(i==1 || i==n)
					System.out.print("*\t");
				else if(j==1 || j==n)
					System.out.print("*\t");
				else if(i==2 || i==n-1)
					{
						if(j==2 || j==n-1)
						System.out.print("*\t");
						else
							System.out.print("\t");
					}
				else
					System.out.print("\t");
			}
			System.out.println();
		}

	}

}
