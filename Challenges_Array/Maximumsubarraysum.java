package Challenges_Array;

import java.util.Scanner;

public class Maximumsubarraysum {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
			int n =sc.nextInt();
			long []A=new long[n];
			for(int i=0;i<n;i++)
			{
				A[i]=sc.nextLong();
			}
			int x=0;
			int y=A.length-1;
			
			
			for(int i=0;i<n;i++)
			{
				if(A[i]>0) {
				x=i;
//					System.out.print(A[i]+" "+x+" ");
					break;
				}
			}
			for(int i=A.length-1;i>=0;i--)
			{
				if(A[i]>0)
				{
					y=i;
//					System.out.print(A[i]+" "+y+" ");
					break;
				}
			}
//			
			long sum=0;
			long max=0;
			for(int i=x;i<=y;i++)
			{
				sum=sum+A[i];
				if(max<sum)
					max=sum;
//				System.out.println(sum);
			}
			
			System.out.println(max);
			t--;
		}

	}

}
