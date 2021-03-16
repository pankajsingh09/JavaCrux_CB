package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows ");
		int n=sc.nextInt();
		
		//using for loop
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
			*/
				
			//using while loop
		
				int nst=1;
				int row=1;
				while(row<=n)
				{
					int cst=1;
					while(cst<=nst)
					{
						System.out.print("* ");
						cst++;
					}
					System.out.print("\n");
					nst++;
					row++;
				}
	}

}
