package Challenges_Array;

import java.util.Scanner;
import java.lang.Math; 

public class Form_Biggest_No_Array {
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t>0) {
		int n =sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		long s=0;
		for(int i=0;i<n;i++)
		{
			s=biggestno(s, A[i]);
		}
		System.out.println(s);
		}

	}
	
	public static long biggestno(long s,int x)
	{
		int l1 = (int)(Math.log10(s)+1);
		int l2 = (int)(Math.log10(x)+1);
		long p1=(long)Math.pow(10, l1);
		long p2=(long)Math.pow(10, l2);
		long a=s*p2+x;
		long b=x*p2+s;
		if(a>b)
			return a;
		else
			return b;
	}

}
