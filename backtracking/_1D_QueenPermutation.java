package backtracking;

public class _1D_QueenPermutation {

	static int count=0;
	public static void main(String[] args) {
		
//		boolean []box=new boolean[4];
//		QueenPermutation(box, 0, 2, "");
//		QueenCombination(box,0, 2, "", -1);
//		CoinChange(new int[] {2, 3, 5, 6}, 10,"",0);
//		CoinChangePermutation(new int[] {2, 3, 5,6},10,"");
//		QueenCombinationBoxRespect(new boolean[4], 0, 0, 2, "");
		CoinChangeCoinRespect(new int[] {1,2,3},0,4, "");
	}	
	
	public static void QueenPermutation(boolean[] boxes,int qpsf,int tq,String ans)
	{
		if(qpsf==tq) {
		count++;
			System.out.println(count+" "+ans);
			return;
		}
		for(int i=0;i<boxes.length;i++)
		{
			if(boxes[i]==false) {
			boxes[i]=true;
			QueenPermutation(boxes, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ");
			boxes[i]=false;
			}
		}
		
	}
	
	public static void QueenCombination(boolean []box,int qpsf,int tq,String ans,int lastBoxUsed)
	{
		
		if(qpsf==tq)
		{
			count++;
			System.out.println(count+". " +ans);
			return ;
		}
		
		for(int i=lastBoxUsed+1;i<box.length;i++)
		{
			box[i]=true;
			QueenCombination(box, qpsf+1, tq, ans+"q"+qpsf+"b"+i+" ", i);
			box[i]=false;
		}
	}
	
	public static void CoinChange(int []denom,int amount,String ans,int lastDenomUsed)
	{
		if(amount==0)
		{
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		for(int i=lastDenomUsed;i<denom.length;i++)
		{	
			if(amount>=denom[i])
			CoinChange(denom, amount-denom[i], ans+denom[i], i);
		}
	}
	public static void CoinChangePermutation(int []denom,int amount,String ans)
	{
		if(amount==0)
		{
			count++;
			System.out.println(count+". "+ans);
			return;
		}
		
		for(int i=0;i<denom.length;i++)
		{	
			if(amount>=denom[i])
			CoinChangePermutation(denom, amount-denom[i], ans+denom[i]);
		}
	}

	public static void QueenCombinationBoxRespect(boolean []box,int col,int qpsf,int tq,String ans)
	{
		
		//positive base case
		if(qpsf==tq)
		{
			System.out.println(ans);
			return;
		}
		
		//Negative base case
		if(col==box.length)
		{
			return;
		}
		//place
		box[col]=true;
		QueenCombinationBoxRespect(box, col+1, qpsf+1, tq, ans+"b"+col);
		box[col]=false;
		
		//Not place
		QueenCombinationBoxRespect(box, col+1, qpsf, tq, ans);
		
	}
	
	public static void CoinChangeCoinRespect(int []denom,int vidx,int amount,String ans)
	{
		
		//positive base case
		if(amount==0)
		{
			System.out.println(ans);
			return;
		}
		//negative base case
		if(amount <0 || vidx==denom.length)
		{
			return;
		}
		
		
		//yes
		CoinChangeCoinRespect(denom, vidx, amount-denom[vidx], ans+denom[vidx]);
		//no
		CoinChangeCoinRespect(denom, vidx+1, amount, ans);
		
	}
	
	
	
	
	
	
}
