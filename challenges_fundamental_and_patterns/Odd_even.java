package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0)
		{
			int even=0;
			int odd=0;
			int a=sc.nextInt();
					while(a!=0)
					{
						int x=a%10;
						if(x%2==0)
						even=even+x;
						else
							odd=odd+x;
						a=a/10;
					}
			if(odd%3==0)
			{
				System.out.println("Yes");
			}
			else if(even%4==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			n--;
		}

	}

}
