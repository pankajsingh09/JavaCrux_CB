package linkedList;

public class UsingLLasStack {
	
	private LinkedList stack;
	public UsingLLasStack() {
				
		stack=new LinkedList();	
		}
	
	public void push(int data)
	{
		stack.addFirst(data);
	}
	
	public int pop() throws Exception
	{
		return stack.removeFirst();
	}
	
	public int top() throws Exception
	{
		return stack.getFirst();
	}
	
	public void display()
	{
		stack.display();
	}
	
	public boolean isEmpty()
	{
		return stack.size()==0;
	}
	
	public int size()
	{
		return stack.size();
	}

}
