package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Check_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		if(flag==true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
