package stack;

import java.util.Stack;
import java.util.Scanner;

public class balancedParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean flag=paranthesis(str);
		if(flag==true)
		System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static boolean paranthesis (String str)
	{
		Stack<Character> s=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
			{
				s.push(str.charAt(i));
			}
			else
			if(str.charAt(i)=='}' || str.charAt(i)==')' || str.charAt(i)==']')
			{
				if(s.isEmpty()) {
					return false;
				}
				char temp=s.peek();
				if(temp=='{' && str.charAt(i)=='}'){
				s.pop();
				}
				
				else if(temp=='[' && str.charAt(i)==']'){
					s.pop();
				}
				else if(temp=='(' && str.charAt(i)==')'){
					s.pop();
				}
				else 
					return false;
			}
			else
			{
				//do nothing
			}
				
		}
		
		if(s.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
