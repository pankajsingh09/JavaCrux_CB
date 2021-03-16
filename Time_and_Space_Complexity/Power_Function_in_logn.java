package Time_and_Space_Complexity;

public class Power_Function_in_logn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(power(2,7));

	}
	
	public static int power(int num,int p)
	{
		if(p==0)
		{
			return 1;
		}
		
		int val=power(num, p/2);
		if(p%2==1)
		{
			return val*val*num;
		}
		else {
			return val*val;
		}
			
			
	}

}
