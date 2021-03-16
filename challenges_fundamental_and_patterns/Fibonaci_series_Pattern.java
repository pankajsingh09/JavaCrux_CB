package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Fibonaci_series_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = 0;
		int nst=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=nst;j++)
			{
				System.out.print(a+"\t");
				sum = a + b;
				a = b;
				b = sum;
			}
			System.out.println();
			nst++;
		}

	}

}
