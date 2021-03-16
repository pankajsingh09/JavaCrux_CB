package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Increasing_decreasing_sequence {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int y=0;
		boolean flag=false;
		int [ ] A=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			int x=sc.nextInt();
			A[i]=x;
			if(y<x)
			{
				flag=true;
			}
			if(x<y)
			{
				flag=false;
			}
			y=x;
			
		}
		System.out.println(flag);

	}

}
