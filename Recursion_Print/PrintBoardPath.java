package Recursion_Print;

public class PrintBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getboardpath(0, 10, "");

	}
	
	public static void getboardpath(int cur,int end,String str)
	{
		if(cur==end)
		{
			System.out.println(str);
			return;
		}
		
		if(cur>end)
		{
			return;
		}
		
		for(int dice=1; dice<=6;dice++)
		{
			getboardpath(cur+dice, end, str+dice);
		}
	}

}
