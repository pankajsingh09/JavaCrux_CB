package Functions_and_Arrays;

import java.util.Scanner;

public class Array2D {

	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int [][] arr=takeinput();
		display(arr);

	}
	
	private static int[][] takeinput()
	{
		System.out.println("Enter the no of rows");
		int rows=sc.nextInt();
		int arr[][] =new int[rows][];
		for(int row=0;row<rows;row++)
		{
			System.out.println("Enter the no of columns");
			int cols=sc.nextInt();
			arr[row]=new int[cols];
			for(int col=0;col<cols;col++)
			{
				System.out.println("Enter the Value ");
				arr[row][col]=sc.nextInt();
			}
		}
		return arr;
		
		
	}

	private static void display(int[][] arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
