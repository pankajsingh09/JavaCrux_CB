package String;

import java.util.Scanner;

public class stringops {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		display(s);
	}
	
	public static void display(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
