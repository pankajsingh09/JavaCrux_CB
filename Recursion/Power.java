package Recursion;

public class Power {

	public static void main(String[] args) {
		Power p=new Power();
		
		System.out.println(p.power(2, 4));
		
		

	}
	
	int power(int x,int n){
		
		if(n==0)
			return 1;
//		System.out.println(x+" "+(n-1));
		int fn=power(x,n-1);
//		System.out.println(fn);
		int f=x*fn;
//		System.out.println(f);
		return f;
	}

}
