package Recursion_Print;

public class Printmazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mazepath(0, 0, 2, 2, "");

	}

	public static void mazepath(int cc,int cr,int ec,int er,String str)
	{
		if(cr==er && cc==ec)
		{
			System.out.println(str);
			return;
		}
		if(cr>er || cc>ec)
		{
					return;
		}
		mazepath(cc+1, cr, ec, er, str+"H");
		mazepath(cc, cr+1, ec, er, str+"V");
	}
}
