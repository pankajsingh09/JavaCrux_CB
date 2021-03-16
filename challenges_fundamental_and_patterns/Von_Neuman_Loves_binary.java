package challenges_fundamental_and_patterns;

import java.util.Scanner;
import java.lang.Math;
public class Von_Neuman_Loves_binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0)
		{
			int sum=0;
			int x=0;
			int t=sc.nextInt();
			while(t!=0)
			{
				int a=t%10;
				if(a==1)
				sum=sum+(int)Math.pow(2, x);
				x++;
				t=t/10;
				
			}
			System.out.println(sum);
			n--;
		}

	}

}
