package stack;

public class Stack1 {
	private int [] data;
	private int tos;
	
	public Stack1() {
		data=new int[5];
		tos=-1;
	}
	public Stack1(int cap) {
		data=new int[cap];
		tos=-1;
	}
	
	public void push(int item) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Stack is full");
		}
		tos++;
		data[tos]=item;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		int temp=data[tos];
		tos--;
		return temp;
	}
	
	public int peek() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		int temp=data[tos];
		return temp;
	}
	public int size()
	{
		return tos+1;
	}
	 public boolean isEmpty()
	 {
		 return tos==-1;
	 }
	 public boolean isFull()
	 {
		 return tos==data.length-1;
	 }
	 public void display()
	 {
		 System.out.println("--------------");
		 for(int i=tos; i>=0;i--)
		 {
			 System.out.print(data[i]+" ");
		 }
		 System.out.println(".");
		 System.out.println("----------------");
	 }
}
