package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Print_series {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int x=0;
		for(int i=1;x<m;i++)
		{
			int y=(3*i)+2;
			if(y%n!=0)
			{
				System.out.println(y);
				x++;
			}
		}

	}

}
