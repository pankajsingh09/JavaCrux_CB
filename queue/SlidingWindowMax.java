package queue;

import java.util.*;

public class SlidingWindowMax {

	public static void main(String[] args) {

		Solution solution = new Solution();
		int a[] = { 4, 3, 1, 2, 5, 3, 4, 7, 1, 9 };
		int ans[] = solution.maxSlidingWindow(a, 4);

		for (int x : ans) {
			System.out.print(x + " ");
		}
	}
	

	static class Solution {
		public int[] maxSlidingWindow(int[] A, int k) {
	        int n=A.length;
	    	Deque<Integer> q=new LinkedList<>();
	    	int [] ans=new int[n-k+1];
	    	int i=0;
	    	for(;i<k;i++)
	    	{
	    		while(!q.isEmpty() && A[q.peekLast()]<=A[i])
	    		{
	    			q.removeLast();
	    		}
	    		q.addLast(i);
	    	}
	    	
	    	
	    	for(;i<n;i++)
	    	{
	    		ans[i-k]=A[q.peekFirst()];
	    		while(q.peekFirst()<= i-k && !q.isEmpty())
	    		{
	    			q.removeFirst();
	    		}
	    		
	    		while(!q.isEmpty() && A[q.peekLast()]<=A[i])
	    		{
	    			q.removeLast();
	    		}
	    		q.addLast(i);
	    		
	    		ans[i-k]=A[q.peekFirst()];
	    		
	    	}
	    	return ans;
	    	
	    }
}
}

