package queue;

import java.util.LinkedList;


public class QueueUsingLinkedList {
	
	LinkedList<Integer> q;
	
	public QueueUsingLinkedList()
	{
		q=new LinkedList<>();
	}
	
	public void enQueue(int data)
	{
		q.addLast(data);
	}
	
	public int deQueue()
	{
		return q.removeFirst();
	}
	
	public boolean isEmpty()
	{
		return q.isEmpty();
	}
	
	public int getFront()
	{
		return q.getFirst();
	}

	public static void main(String[] args) {
		
		QueueUsingLinkedList q=new QueueUsingLinkedList();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		System.out.println(q.getFront());
		System.out.println(q.deQueue());
		System.out.println(q.getFront());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.getFront());
		
	}

}
