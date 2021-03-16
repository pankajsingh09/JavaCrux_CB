package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=0;
		while(n!=0)
		{
			int a=n%10;
			if(a==m)
			c++;
			n=n/10;
		}
		System.out.println(c);

	}

}
