package queue;

import java.util.Stack;

public class QueueUsingTwoStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		QueueUsingTwoStack q=new QueueUsingTwoStack();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.enQueue(40);
		System.out.println(q.getFront());

	}
	
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	int size=0;
	public void enQueue(int x)
	{
		s1.push(x);
		size++;
	}
	
	public int deQueue() throws Exception
	{
		if(s1.isEmpty())
		{
			throw new Exception("Queue is Empty");
		}
		int siz=size;
		while(siz!=1)
		{
			s2.push(s1.pop());
			siz--;
		}
		int temp=s1.pop();
		size--;
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
			
		}
		return temp;
	}
	
	public int getFront()
	{
		int siz=size;
		while(siz!=1)
		{
			s2.push(s1.pop());
			siz--;
		}
		int temp=s1.peek();
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return temp;
	}

}
