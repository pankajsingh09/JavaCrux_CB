package Recursion;

public class Sorted_or_Not {

	public static void main(String[] args) {
		
		int []arr= { 3,5,6,11,19,27} ;
		int si=0;
		Sorted_or_Not s=new Sorted_or_Not();
		System.out.println(s.sorted_or_not(arr,si));

	}
	
	boolean sorted_or_not(int []arr , int si) {
		
		if(si==arr.length-1)
		{
			return true;
		}
		if(arr[si]>arr[si+1])
			{
			return false;
			}
		else
		{
			boolean ans=sorted_or_not(arr, si+1);
			return ans;
		
		}
	}

}
