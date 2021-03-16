package stack;

import queue.Queue;

public class SUQdequeuEfficient {
	
	private Queue q1;
	private Queue q2;
	
	public SUQdequeuEfficient() {
		
		q1=new Queue();
		q2=new Queue();
	}
	
	public void push(int data) throws Exception
	{
		while(!q1.isEmpty())
		{
			q2.enQueue(q1.deQueue());
		}
		q1.enQueue(data);
		while( !q2.isEmpty())
		{
			q1.enQueue(q2.deQueue());
		}
			
	}
	
	public int  pop() throws Exception
	{
		return q1.deQueue();
	}
	
	public int top() throws Exception
	{
		return q1.getFront();
	}
	
	public void display()
	{
		q1.display();
	}

}
