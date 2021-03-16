package stack;

import queue.Queue;

public class StackUsingQueueEnqueEfficeint{


	private Queue q1;
	private Queue q2;
	
	public StackUsingQueueEnqueEfficeint() {
	
		q1=new Queue();
		q2=new Queue();
	}
	
	public void push(int data) throws Exception
	{
		q1.enQueue(data);
	}
	
	public int pop() throws Exception
	{
		while(q1.size()!=1)
		{
			q2.enQueue(q1.deQueue());
		}
		int temp=q1.deQueue();
		while(!q2.isEmpty())
		{
			q1.enQueue(q2.deQueue());
		}
		return temp;
	}
	
	public int top() throws Exception {
		while(q1.size()!=1)
		{
			q2.enQueue(q1.deQueue());
		}
		int temp=q1.deQueue();
		while(!q2.isEmpty())
		{
			q1.enQueue(q2.deQueue());
		}
		q1.enQueue(temp);
		return temp;
	}
	
	public void display() throws Exception
	{
		reverse(q1);
		q1.display();
		reverse(q1);
	}
	
	private void reverse(Queue q) throws Exception
	{
		if(q.isEmpty())
			return;
		int item=q.deQueue();
		reverse(q);
		q.enQueue(item);
	}
	

}
