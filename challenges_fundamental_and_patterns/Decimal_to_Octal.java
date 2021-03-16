package challenges_fundamental_and_patterns;
import java.lang.*;
import java.util.Scanner;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		int sum=0;
		while(n!=0)
		{
			int a=n%8;
			 int m=(int)(Math.pow(10, x));
			 sum=sum+a*m;
			x++;
			n=n/8;
		}
		System.out.println(sum);
	}

}
