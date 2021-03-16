package Challenges_Array;

import java.util.Scanner;

public class Form_Biggest_No_string {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		int t=sc.nextInt();
		while(t>0) {
			String str="";
		int n =sc.nextInt();
		String [] s=new String[n];
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<s.length;i++)
		{
			str=biggest(str, s[i]);
		}
		System.out.println("\n\n"+str);
		t--;
		}
		
	}
	
	public static String biggest(String s1 ,String s2)
	{
		String a=s1.concat(s2);
		String b=s2.concat(s1);
		if(a.compareTo(b)>0)
			return a;
		else
			return b;
	}
	

}
