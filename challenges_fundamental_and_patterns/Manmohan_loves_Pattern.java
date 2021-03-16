package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Manmohan_loves_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nst=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;i<=nst;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
			nst++;
		}

	}

}
