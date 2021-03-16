package challenges_fundamental_and_patterns;
import java.lang.Math;
import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int x=(int)Math.floor(Math.log10(n) + 1);
		int sum=0;
		int y=n;
		while(y!=0)
		{
			int a=y%10;
			sum=(int)(sum+(Math.pow(a, x)));
			y=y/10;
		}
		if(sum==n)
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
