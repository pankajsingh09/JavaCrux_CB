package queue;
import java.util.*;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax2 {

	public static void main(String[] args) {
		
		solution s=new solution();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []A=new int[n];
		for(int i=0;i<n;i++)
		{
			A[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int ans[]=s.windowmax(A, k);
		
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
		
		
	}

}

 class solution{
	 
	 public  int[] windowmax(int A[],int k)
	 {
		 Deque<Integer> q=new LinkedList<>();
		 int n=A.length;
		 int ans[]=new int[n-k+1];
		 int i=0;
		 for(;i<k;i++)
		 {
			 while(!q.isEmpty() && A[i]>=A[q.getLast()])
			 {
				 q.removeLast();
			 }
			 q.addLast(i);
			 
		 }
		 
		 
		 for(;i<n;i++)
		 {
			  ans[i-k]=A[q.peekFirst()];
			 while(!q.isEmpty() && i-k>=q.peekFirst() )
			 {
				 q.removeFirst();
			 }
			 
			 while(!q.isEmpty() && A[i]>=A[q.getLast()])
			 {
				 q.removeLast();
			 }
			 q.addLast(i);
			 
			 ans[i-k+1]=A[q.peekFirst()];
			 
			 
		 }
		 
		 
		 
		 return ans;
	 }
 }
