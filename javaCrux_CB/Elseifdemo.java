package javaCrux_CB;

import java.util.Scanner;

public class Elseifdemo {

	public static void main(String[] args) {
			
		System.out.println("Enter your age : ");
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		
		if(age<=11)
		{
			System.out.println("You are child");
		}
		else if(age>=12 && age<18)
		{
			System.out.println("You are teenager");
		}
		else if(age>=18 && age<=60)
		{
			System.out.println("You are adult");
		}
		else
		{
			System.out.println("You are old");
		}
		
	}

}
