package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pattern_doubleslidearrow {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n=sc.nextInt();
		int nsp=n-1;
		int nsp1=-1;
		int nst=1;
		int nst1=1;
		int x=1;
		
		//row
		int row=1;
		while(row<=n)
		{
			//space
			for(int i=1;i<=nsp;i++)
			{
				System.out.print("\t");
			}
			
			//stars
			int y=x;
			for(int i=1;i<=nst;i++)
			{
				System.out.print(y+"\t");
				y--;
			}
			
			//space
			for(int i=1;i<=nsp1;i++)
			{
				System.out.print("\t");
			}
			
			//stars
			if(row==1 || row==n)
			{
				System.out.print("\t");
			}
			else {
			for(int i=1;i<=nst1;i++)
			{
				System.out.print(i+"\t");
			}
			}
			System.out.println();
			if(row<=n/2)
			{
				nsp-=2;
				nst++;
				nsp1+=2;
				nst1++;
				x++;
			}
			else
			{
				nsp+=2;
				nst--;
				nsp1-=2;
				nst1--;
				x--;
			}
			row++;
		}
		
		
	}

}
