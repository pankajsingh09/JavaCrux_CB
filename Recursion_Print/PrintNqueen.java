 package Recursion_Print;

public class PrintNqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][]board=new boolean[4][4];
		countNQueen(board, 0,"");
			}
	
	public static void countNQueen(boolean[][] board,int row,String str)
	{
		if(row==board.length)
		{
			System.out.println(str);
			return;
		}
				for(int col=0;col<board[row].length;col++)
		{
			if(istrue(board,row,col))
			{
				board[row][col]=true;
				countNQueen(board, row+1,str+"{"+(row+1)  +","+(col+1)  +"}, ");
				board[row][col]=false;
			}
		}
	}
	
	private static boolean istrue(boolean [][]board,int row,int col)
	{
		for(int i=row;i>=0;i--)
		{
			if(board[i][col])
			{
				return false;
			}
		}
		for(int i=row,j=col;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j])
			{
				return false;
			}
		}
		for(int i=row,j=col;i>=0 && j<board.length;i--,j++)
		{
			if(board[i][j])
			{
				return false;
			}
		}
		
		return true;
		
	}

}
