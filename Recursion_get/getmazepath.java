package Recursion_get;

import java.util.ArrayList;

public class getmazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getmazehr(0, 0, 2, 2));
	}
	
	public static ArrayList<String> getmazehr(int cc,int cr,int er,int ec)
	{
		if(cc==ec && cr==er)
		{
			ArrayList<String> mr=new ArrayList<>();
			mr.add("");
			return mr;
		}
		if(cc>ec || cr>er)
		{
			ArrayList<String> x=new ArrayList<>();
			return x;
		}
		
		ArrayList<String> mrh=new ArrayList<>();
		ArrayList<String> rrh=getmazehr(cc+1, cr, er, ec);
		
		for(String rrhs:rrh)
		{
			mrh.add("H"+rrhs);
		}
		ArrayList<String> rrv=getmazehr(cc, cr+1, er, ec);
		for(String rrvs:rrv)
		{
			mrh.add("V"+rrvs);
		}
		
		return mrh;
	}

}
