package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Simple_input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		int sum=0;
		do {
		int n = sc.nextInt();
		sum=sum+n;
		if(sum<0) {
			flag=false;
		break;
		}
		System.out.println(n);
		}while(flag);

	}

}
