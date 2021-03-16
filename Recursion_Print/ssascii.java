package Recursion_Print;

public class ssascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ss("ab","");
	}
	
	public static void ss(String str,String result)
	{
		if(str.length()==0)
		{
			System.out.println(result);
			return;
		}
		
		char cc=str.charAt(0);
		int casc=str.charAt(0);
		String ros=str.substring(1);
		ss(ros,result);
		ss(ros, result+cc);
		ss(ros, casc+result);
	}

}
