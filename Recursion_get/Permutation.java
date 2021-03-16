package Recursion_get;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(p("abc"));
	}
	public static ArrayList<String> p(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> X=new ArrayList<>();
			X.add("");
			return X;
		} 
		
		char c=str.charAt(0);
		String sub=str.substring(1);
		ArrayList<String> rc=p(sub);
		ArrayList<String> rt=new ArrayList<>();
		for(String s : rc) {
		for(int i=0;i<=s.length();i++)
		{
			String m=s.substring(0, i)+c+s.substring(i);
			rt.add(m);
		}
		}
		return rt;
		
	}

}
