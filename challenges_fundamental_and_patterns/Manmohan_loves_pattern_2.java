package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Manmohan_loves_pattern_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=nst;j++)
			{
				if(i==1)
				{
					System.out.print("1\t");
				}
				else if(i>1 && (j==1 || j==nst)) {
					System.out.print(i-1+"\t");
				}
				else
					System.out.print("0\t");
					
				
			}
			System.out.println();
			nst++;
		}
	}

}
