package Functions_and_Arrays;

import java.util.Scanner;

public class Anybasetodecimal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sno and sb");
		int sn=sc.nextInt();
		int sb=sc.nextInt();
		decimal(sn,sb);
	}
	public static void decimal(int x , int y)
	{
		int mul=1;
		int ans=0;
		while(x!=0)
		{
			int rem=x%10;
			ans=ans+rem*mul;
			mul=mul*y;
			x=x/10;
		}
		System.out.println(ans);
	}

}
