package Challenges_String;

import java.util.Scanner;

public class Sanket_and_String {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
//		int n=sc.nextInt()
		int n=2;
//		System.out.println("Enter the string");
//		String s=sc.next();
		String s="babababaaaaa";
		StringBuilder sb=new StringBuilder(s);
		
		int a=0;
		int b=0;
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='a')
			{
				a++;
			}
			if(sb.charAt(i)=='b')
			{
				b++;
			}
		}
		System.out.println(sb+" "+a+" "+b);
		
		int count=0;
		if(a>=b)
		{
			for(int i=0;i<sb.length();i++)
			{
				if(count<n) {
				if(sb.charAt(i)=='b')
				{
					sb.replace(i, i+1, "a");
					count++;
				}
				}
				else
				{
					break;
				}
			}
		}
		if(b>a) {
			for(int i=0;i<sb.length();i++)
			{
				if(count<n) {
				if(sb.charAt(i)=='a')
				{
					sb.replace(i, i+1, "b");
					count++;
				}
				}
				else
				{
					break;
				}
			}
		}
		
		System.out.println(sb);
		

	}

}
