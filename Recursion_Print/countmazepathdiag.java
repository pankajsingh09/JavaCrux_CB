package Recursion_Print;

public class countmazepathdiag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int c=pmpd(0,0, 2, 2);
			System.out.println(c);
	}
	 public  static int pmpd(int cc,int cr,int ec,int er)
	 {
		 if(cc==ec && cr==er)
		 {
			 return 1;
		 }
		 if(cc>ec || cr>er)
		 {
			  return 0;
		 }
		 
		 int ch=pmpd(cc+1, cr, ec, er );
		int cv= pmpd(cc, cr+1, ec, er);
		 int cd=pmpd(cc+1, cr+1, ec, er);
		 return ch+cv+cd;
	 }

}
