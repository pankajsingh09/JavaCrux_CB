package Recursion_Print;

public class CountBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=getboardpath(0, 10);
		System.out.println(c);

	}
	
	public static int getboardpath(int cur,int end)
	{
		if(cur==end)
		{
			return 1;
		}
		
		if(cur>end)
		{
			return 0;
		}
		int count=0;
		for(int dice=1; dice<=6;dice++)
		{
			count+=getboardpath(cur+dice, end);
		}
		
		return count;
	}

}
