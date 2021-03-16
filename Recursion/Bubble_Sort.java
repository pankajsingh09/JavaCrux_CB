package Recursion;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		int[]arr= { 50,4,30,20,60,2,100};
		int [] arr1=bs(arr,0,arr.length-1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+"\t");
		}
	}
	
	public static int[] bs(int[]arr,int si,int li)
	{
		if(li==0)
			return arr;
		if(si==li)
		{	
			bs(arr,0,li-1);
			return arr;
		}
		if(arr[si]>arr[si+1])
		{
			int temp=arr[si];
			arr[si]=arr[si+1];
			arr[si+1]=temp;
		}
		bs(arr,si+1,li);
		
		return arr;
	}

}
