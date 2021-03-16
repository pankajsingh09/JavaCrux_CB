package Challenges_Array;

import java.util.Scanner;

public class Sorting_linear_time {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		
		int l=0;
		int m=0;
		int h=arr.length-1;
		while(m<=h)
		{
			if(arr[m]==0)
			{
				int temp=arr[m];
				arr[m]=arr[l];
				arr[l]=temp;
				l++;
				m++;
			}
			else if(arr[m]==1)
			{
				m++;
			}
			else
			{
			int temp=arr[m];
				arr[m]=arr[h];
				arr[h]=temp;	
				h--;
			}
		}
		
		System.out.println("The array is");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
