package Functions_and_Arrays;

import java.util.Scanner;

public class ArrayOperations {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int arr[]=takeinput();
		display(arr);
		System.out.println("maximum element in array is"+findmax (arr));
		// liner search
		System.out.println("Linear search");
		System.out.println("Enter element to be find");
		int ele=sc.nextInt();
		System.out.println("element present at  "+linearsearch(arr,ele)+"  index");
		//Binary search
		System.out.println("Binary search");
		System.out.println("Enter element to be find");
		int bs=sc.nextInt();
		System.out.println("element present at  "+binarysearch(arr, bs)+"  index	");
		

	}
	public static int[] takeinput() {
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int []arr =new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element at "+i+" index");
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
		
		public static int findmax (int[] arr)
		{
			int max=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
					max=arr[i];
			}
			return max;
	}

		public static int linearsearch(int[] arr,int item)

		{
			for(int i=0;i<arr.length;i++)
			{
				if(item==arr[i])
				{
					return i;
				}
			}
		return -1;
		}
		
		public static int binarysearch(int []arr,int item)
		{
			int l=0;
			int h=arr.length-1;
			int mid=(l+h)/2;
			while(l<=h)
			{
				mid=(l+h)/2;
				if(arr[mid]==item)
					return mid;
				else if(arr[mid]<item)
				{
					l=mid+1;
				}
				else {
					h=mid-1;
				}
			}
			return -1;
		}
		
}
