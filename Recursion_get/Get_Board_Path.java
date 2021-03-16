package Recursion_get;

import java.util.ArrayList;

public class Get_Board_Path {

	public static void main(String[] args) {
		
		System.out.println(path(0,10));

	}
	
	public static ArrayList<String> path(int start,int end)
	{
			if(start==end)
			{
				ArrayList<String> x=new ArrayList<>();
				x.add("\n");
				return x;
			}
			if(start>end)
			{
				ArrayList<String> x=new ArrayList<>();;
				return x;
			}
		
	
		ArrayList<String >mr=new ArrayList<>();
		for(int dice=1;dice<=6;dice++)
		{
				ArrayList<String> rr=path(start+dice, end);
				for(String s:rr) {
				mr.add(dice+s);
				}
	}
		return mr;

   }
}
