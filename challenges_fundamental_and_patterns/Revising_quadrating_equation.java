package challenges_fundamental_and_patterns;
import java.lang.Math;
import java.util.Scanner;

public class Revising_quadrating_equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x=(b*b)-(4*a*c);
//		System.out.println(x);
		double y=Math.sqrt(x);
		int s1=(int)(-b+y)/(2*a);
		int s2=(int)(-b-y)/(2*a);
		
		 if(x==0 && a!=0)
			{
				System.out.println("Real and Equal");
				if(s1<s2) {
					System.out.println(s1+"\t"+s2);
					}
					else{
						System.out.println(s2+"\t"+s1);
					 }
			}
		 else if(x<0)
				System.out.println("Imaginary");
		
		 else if(a>=-100 && a<=100 && b>=-100 && b<=100 && c>=-100 && c<=100)
		{
			System.out.println("Real and Distinct");
			if(s1<s2) {
				System.out.println(s1+"\t"+s2);
				}
				else{
					System.out.println(s2+"\t"+s1);
				 }
		}
		
		
		
		
	
		

	}

}
