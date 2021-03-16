package Recursion_Print;

public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printss("abc", "");

	}
	
	public static void printss(String str,String result)
	{
		if(str.length()==0)
		{
			System.out.println(result);
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printss(ros, result);
		printss(ros, result+cc);
	}

}
