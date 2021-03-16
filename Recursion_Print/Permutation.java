package Recursion_Print;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("abc","");
	}
	
	public static void perm(String str,String result)
	{
		if(str.length()==0)
		{
			System.out.println(result);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			perm(ros,result+c);
		}
	}

}
