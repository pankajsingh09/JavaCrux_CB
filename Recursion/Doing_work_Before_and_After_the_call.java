package Recursion;

public class Doing_work_Before_and_After_the_call {

	public static void main(String[] args) {
		int  n=5;
		PD(n);
		PI(n);

	}
	
	public static void PD(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		PD(n-1);
	}
	public static void PI(int n)
	{
		if(n==0)
			return;
		PI(n-1);  
		System.out.println(n);
	}
	
	

}
