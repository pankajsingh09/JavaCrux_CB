package challenges_fundamental_and_patterns;
import java.lang.Math;
import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int x=0;
		while(n!=0)
		{
			int a=n%10;
			if(a==1)
			{
			sum=(int)(sum+(Math.pow(2, x)));
			}
			x++;
			n=n/10;
		}
				System.out.println(sum);
	}

}
