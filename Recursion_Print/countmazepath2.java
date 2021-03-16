package Recursion_Print;

public class countmazepath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=mazepath(0, 0, 2, 2 );
		System.out.println(c);
	}

	public static int mazepath(int cc,int cr,int ec,int er)
	{
		if(cr==er && cc==ec)
		{
			return 1;
		}
		if(cr>er || cc>ec)
		{
			return 0;
		}
		
		int ch=	mazepath(cc+1, cr, ec, er);
		int cv=mazepath(cc, cr+1, ec, er);
		return ch+cv;
	}
}
