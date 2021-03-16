package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Basic_Calculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		boolean flag=false;
		
		do {
			char ch=sc.next().charAt(0);
			
			if(ch=='X' || ch=='x')
			{
				flag=true;
				break;
			}
			
			else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%' )
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				switch(ch)
				{
				case '+':
					System.out.println(a+b);
					break;
				case '-':
					System.out.println(a-b);
					break;
				case '*':
					System.out.println(a*b);
					break;
				case '/':
					System.out.println(a/b);
					break;
				case '%':
					System.out.println(a%b);
					break;
				}
			}
			else {
				System.out.print("'Invalid operation. Try again.");
			}
			
				}while(flag!=true);

	}

}
