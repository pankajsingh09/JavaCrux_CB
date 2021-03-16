package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Print_reverse {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n!=0)
		{
			int a=n%10;
			sum=sum*10+a;
			n=n/10;
		}
		System.out.println(sum);

	}

}
