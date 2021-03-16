package queue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberInEveryWindow {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int x=sc.nextInt();
			int [] arr=new int[x];
			for(int l=0;l<x;l++)
			{
				arr[l]=sc.nextInt();
			}
			int k=sc.nextInt();
			int ans[]=firstNegativeNoInWindow(arr,k);
			for(int i:ans)
			{
				System.out.print(i+" ");
			}
			
		}
		
	}
	
	public static int[] firstNegativeNoInWindow(int[] A,int k)
	{
		Queue<Integer> q=new LinkedList<>();
		int i=0;
		int n=A.length;
		int []ans=new int[n-k+1];
		
		if(n==k)
			for(int p=0;p<n;p++)
			{
				if(A[p]<0)
				{
					ans[n-k]=A[p];
					return ans;
				}
			}
		for(;i<k;i++)
		{
			while(!q.isEmpty() && A[q.peek()] >0)
			{
				q.remove();
			}
			if(A[i] < 0)
			q.add(i);
		}
		
		for(;i<n;i++)
		{
			if(A[q.peek()] < 0) {
				ans[i-k]=A[q.peek()];
			}
			while(!q.isEmpty() && i-k>=q.peek()  )
			{
				q.remove();
			}
			while(!q.isEmpty() && A[q.peek()]>0)
			{
				q.remove();
			}
			q.add(i);
			if(A[q.peek()] < 0 )
			{
			ans[i-k+1]=A[q.peek()];
			}
			else
				ans[i-k+1]=0;
		}
		return ans;
	}
	

}
