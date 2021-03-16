package Recursion;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		Pattern p=new Pattern();
		p.pattern(n,1,1);
	}

	void pattern(int n ,int row,int col)
	{
		if(row>n)
			return ;
		if(col>row)
		{
			System.out.println();
			pattern(n,row+1,1);
			return ;
		}
		
		System.out.print("* ");
		pattern(n,row,col+1);
	}
	
	
}
