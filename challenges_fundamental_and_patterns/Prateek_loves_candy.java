package challenges_fundamental_and_patterns;

import java.util.Scanner;
import java.lang.Math;
public class Prateek_loves_candy {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		int n=sc.nextInt();
		int num=3;
		int status=1;
		int x=2;
		for(int i=2;i<=n;)
		{
			for(int j=2;j<=Math.sqrt(num);j++)
			{
				if(num%j==0)
				{
					status=0;
					break;
				}
			}
			
			if(status!=0)
			{
				i++;
			}
			status=1;
			x=num;
			num++;
		}
		System.out.println(x);
		
		
		t-=1;
		}

	}

}
