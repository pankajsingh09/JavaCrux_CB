package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Pythagorus_triplet {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int x=0,y=0;
		if(n%2!=0)
		{
			double a=(n/2*n/2);
			double b=(n*n)/2;
			System.out.println(a+" "+b);
			x=(int)a;
			y=(int)b;
			
		}
		else if(n%2==0) {
			x=(int)((n/2.0f)*(n/2.0f)-1);
			y=(int)((n/2.0f)*(n/2.0f)+1);		
			}
			
//		System.out.println(x+" "+y);

	}

}
