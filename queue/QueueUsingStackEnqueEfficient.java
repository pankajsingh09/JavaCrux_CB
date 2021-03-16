package queue;

import java.util.Stack;

public class QueueUsingStackEnqueEfficient {

	private Stack<Integer> s1=new Stack<>();
	private Stack<Integer>s2=new Stack<>();
	public void enQueue(int x)
	{
		s1.push(x);
	
	}
	 
	public int deQueue()
	{
		int x=s1.size();
		while(x!=1)
		{
			s2.push(s1.pop());
			x--;
		}
		int temp=s1.pop();
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return temp;
	}
	
	public int getFront()
	{
		int x=s1.size();
		while(x!=1)
		{
			s2.push(s1.pop());
			x--;
		}
		int temp=s1.peek();
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return temp;
	}
	
	/*public void display(Stack<Integer> s1,Stack<Integer> s2)
	{
		if(s1.isEmpty())
		{
			return;
		}
		int element=s1.pop();
		display(s1, s2);
		s2.push(element);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		
		
	} */
	
	public void display()
	{
		
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		while(!s2.isEmpty())
		{
			System.out.print(s2.peek()+" ");
			s1.push(s2.pop());
		}
		System.out.println();
		
	}
	
	

}
