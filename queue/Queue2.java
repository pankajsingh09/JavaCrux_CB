package queue;

public class Queue2 {
	
	private int[] data;
	private int size;
	private int front;
	private int rear;
	
	public Queue2() {
			
		data=new int[5];
		size=0;
		front=0;
		rear=-1;
	}
	public Queue2(int cap) {
		
		data=new int[cap];
		size=0;
		front=0;
		rear=-1;
	}
	
	public void enQueue(int item) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue is full");
		}
		rear=(rear+1)%data.length;
		data[rear]=item;
		size++;
	}
	
	public int deQueue() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		data[front]=0;
		front=(front+1)%data.length;
		size--;
		return temp;
	}
	
	public int getFront() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue is Empty");
		}
		int temp=data[front];
		return temp;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean isFull()
	{
		return size==data.length;
	}
	
	public void display() {
		System.out.println("--------------------");
		for(int i=0;i<size();i++)
		{
			int index=(front+i)%data.length;
			System.out.print(data[index]+" ");
		}
		
		System.out.println(".");
		System.out.println("--------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
