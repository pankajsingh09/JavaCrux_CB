package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int n=sc.nextInt();
		
		int x=1;
		int y=1;
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=x;j++)
			{
				if(j%2!=0)
				{
					System.out.print(y +"\t");
				}
				else
					System.out.print("*\t");
			}
			System.out.println();
			
			if(i<n)
			{
				x+=2;
				y++;
			}
			else
			{
			x-=2;
			y--;
			}
		}
		
	}

}
