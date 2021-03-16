package Recursion;

import java.util.Scanner;

public class Doing_work_while_stack_is_building {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PD(n);
	}
	
	public static void PD(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		PD(n-1);
	}

}
