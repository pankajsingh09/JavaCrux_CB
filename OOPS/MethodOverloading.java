package OOPS;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1.2,5.7));
		System.out.println(sum(1,2,3,4,5,6,7,8,9));
		System.out.println(sum("hello",1,2,3,4,5,6,7,8,9));

	}
	
	public static int sum(int a,int b)
	{
			return a+b;
	}
	
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static double sum(double a,double b)
	{
			return a+b;
	}
	
	//overloading is not done on the basis of return type
	
//	public static void sum(int a,int b,int c)
//	{
//		System.out.println(a+b+c);
//	}
	
	public static int sum(int... arg)
	{
		int sum=0;
		for(int val:arg)
		{
			sum+=val;
		}
		return sum;
	}
	// in a method there should be only one variable no of argument and that must be at last
//	public static int sum(int... arg,double... arg2)
//	{
//		
//	}
	
	public static int sum(String str,int... arg)
	{
		System.out.print(str+" ");
		int sum=0;
		for(int val:arg)
		{
			sum+=val;
		}
		return sum;
	}
	
	
	

}
