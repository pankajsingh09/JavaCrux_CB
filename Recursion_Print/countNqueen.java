 package Recursion_Print;

public class countNqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [][]board=new boolean[4][4];
		int c=countNQueen(board, 0);
		System.out.println(c);
	}
	
	public static int countNQueen(boolean[][] board,int row)
	{
		if(row==board.length)
		{
			return 1;
		}
		int count=0;
		for(int col=0;col<board[row].length;col++)
		{
			if(istrue(board,row,col))
			{
				board[row][col]=true;
				count=count+countNQueen(board, row+1);
				board[row][col]=false;
			}
		}
		return count;
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
