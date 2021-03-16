package stack;

public class Stack {
	
	protected int [] data;
	protected int top=-1;
	public static final int Default_Capacity=10;
	public Stack() {
			this(Default_Capacity);
	}
	public Stack(int capacity)
	{
		data=new int[capacity];
	}
	
	public void push(int val) throws Exception
	{
		if(this.top==this.data.length)
		{
			throw new Exception("Stack Overflow");
		}
		this.top++;
		this.data[this.top]=val;
	}
	
	public int pop()throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("Stack Underflow");
		}
		int val=this.data[this.top];
		this.top--;
		return val; 
	}
	
	public boolean isEmpty()
	{
		if(this.top==-1)
		{
			return true;
		}
		else
			return false;
	}
	
	public void display()
	{
		for(int i=this.top;i>-1;i--)
		{
			System.out.print(data[i]+",");
		}
		System.out.println("END");
	}
	
	public int size()
	{
		int s=this.top+1;
		return s;
	}
}
