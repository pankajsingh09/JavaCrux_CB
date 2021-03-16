package Recursion;

public class Factorial {

	public static void main(String[] args) {
		
		int n=4;
		System.out.println(fact(n));

	}
	
	public static int fact(int n) {
		
		if(n==1)
		{
			return 1;
		}
		n=n*fact(n-1);
		return n;
		
	}

}
