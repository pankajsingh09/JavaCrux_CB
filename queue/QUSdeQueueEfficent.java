package queue;

import stack.Stack;

public class QUSdeQueueEfficent {
	public static void main(String[] args) throws Exception {
		QUSdeQueueEfficent q=new QUSdeQueueEfficent();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		
		q.display();
		System.out.println(q.deQueue());
		q.display();
		
	}
	
	private Stack s1;
	private Stack s2;
	
	public QUSdeQueueEfficent() {
	this.s1=new Stack();
	this.s2=new Stack();
	}
	
	public void enQueue(int data) throws Exception
	{
		while(!s1.isEmpty())
			s2.push(s1.pop());
		s1.push(data);
		while(!s2.isEmpty())
			s1.push(s2.pop());
		
	}
	
	public int deQueue() throws Exception
	{
		 return s1.pop();
	}
	
	public void display() throws Exception
	{
		s1.display();
	}

}
