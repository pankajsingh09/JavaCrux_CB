package Recursion_Print;

public class printmazepathdiag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			pmpd(0,0, 2, 2, "");
	}
	 public  static void pmpd(int cc,int cr,int ec,int er,String str)
	 {
		 if(cc==ec && cr==er)
		 {
			 System.out.println(str);
			 return;
		 }
		 if(cc>ec || cr>er)
		 {
			  return;
		 }
		 
		 pmpd(cc+1, cr, ec, er, str+"H");
		 pmpd(cc, cr+1, ec, er, str+"V");
		 pmpd(cc+1, cr+1, ec, er, str+"D");
		 
	 }

}
