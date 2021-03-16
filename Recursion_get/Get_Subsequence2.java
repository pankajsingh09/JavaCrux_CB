package Recursion_get;

import java.util.ArrayList;

public class Get_Subsequence2 {

	public static void main(String[] args) {
		
		ArrayList<String> s=ss("ab");
		System.out.println(s);

	}
	public static ArrayList<String> ss(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> X=new ArrayList<>();
			X.add(" ");
			return X;
		}
		
		char cc=str.charAt(0);
		int a=str.charAt(0);
		String s=str.substring(1);
		ArrayList<String> Ret=new ArrayList<>();
		ArrayList<String> ref=ss(s);
		
		for(int i=0;i<ref.size();i++)
		{
			Ret.add(ref.get(i));
			Ret.add(cc+ref.get(i));
			Ret.add(a+ref.get(i));
		}
		
		return Ret;
		
		
	}

}
