package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of no. of rows");
		int n =sc.nextInt();
		
		// printing pattern using for loop
		
		for(int i=0;i<n;i++)
		{
			//work
			
			System.out.print("*");
			
			//preparation
			
			System.out.print("\n");
		}
		
	}

}
