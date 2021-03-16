package Recursion;

public class Doing_Work_before_and_After_the_call_ {

	public static void main(String[] args) {
		int n=5;
		PDI(n);

	}
	public static void PDI(int n) {
		
		if(n==0)
			return;
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}

}
