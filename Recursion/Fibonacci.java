package Recursion;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		int n=7;
		System.out.println(f.fibo(n));
	}
	
	int fibo(int n)
	{
		if(n==1 || n==0)
			return n;
		int f=fibo(n-1)+fibo(n-2);
		return f;
	}

}
