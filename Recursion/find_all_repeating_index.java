package Recursion;

import java.util.ArrayList;

public class find_all_repeating_index {

	public static void main(String[] args) {
		
		int []arr= { 3,5,6,11,5,19,5,27} ;
		int data=5;
		 find_all_repeating_index  s=new  find_all_repeating_index ();
//		int [] arr1=find(arr, 0, data, 0);
		 int [] arr1=find(arr, 0, data, 0);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		
		
		
		//using ArrayList
//		ArrayList<Integer>A=new ArrayList<>();
//		 ArrayList<Integer>B=s.find(arr,0,data,A);
//		 System.out.println(B);
	}
	
	ArrayList<Integer> find(int []arr , int si,int data, ArrayList<Integer>a) {
		
		if(si==arr.length)
		{
			return a;
		}
		if(arr[si]==data)
			{
			a.add(si);
			}
		
			find(arr, si+1,data,a);

		return a;
		}
	
	public static int[] find(int []arr,int si,int data,int count)
	{
		int[] A=null;
		if(si==arr.length)
		{
			int []x=new int[count];
			return x;
		}
		if(arr[si]==data)
		{
			A=find(arr, si+1, data, count+1);
		}
		else {
			A=find(arr, si+1, data, count);
		}
		if(arr[si]==data)
		{
			A[count]=si;
		}
		return A;
		
	}
	

}
