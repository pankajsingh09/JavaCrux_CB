package Recursion_get;

import java.util.ArrayList;

public class Get_Subsequence {

	public static void main(String[] args) {
		
		ArrayList<String> s=ss("ABC");
		System.out.println(s);

	}
	public static ArrayList<String> ss(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> a=new ArrayList<>();
			a.add(" ");
			return a;
		}
		
		char cc=str.charAt(0);
		String s=str.substring(1);
		ArrayList<String> rr=new ArrayList<String>();
		ArrayList<String> res=ss(s);
		for(int i=0;i<res.size();i++)
		{
			rr.add(res.get(i));
			rr.add(cc+res.get(i));
		}
		return rr;
		
	}

}
