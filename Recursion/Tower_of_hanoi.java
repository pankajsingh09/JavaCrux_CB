package Recursion;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		
		
		th(4, "src", "des", "helper");
	}
	public static void th(int n,String src,String des,String helper)
	{
		if(n==0)
			return;
		th(n-1,src,helper,des);
		System.out.println("Move " +n+"th disc from "+src +" to "+des+" tower");
		th(n-1,helper,des,src);
	}

}
