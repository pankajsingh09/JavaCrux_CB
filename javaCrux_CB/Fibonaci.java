package javaCrux_CB;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int count = 1;
		int sum = 0;
		while (count <= n )
		{
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			count++;
		}

	}

}
