package stack;

import java.util.LinkedList;
import java.util.Queue;


public class StackUsingTwoQueue {
	
public static void main(String[] args) throws Exception {
		
		StackUsingTwoQueue s=new StackUsingTwoQueue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(70);
		System.out.println(s.top());
	}

	Queue<Integer> A=new LinkedList<>();
	Queue<Integer> B=new LinkedList<>();
	int size=0;
	//pop Efficient
	/*
	public void push(int x)
	{
			B.add(x);
			size++;
			while(!A.isEmpty())
			{
				B.add(A.remove());
			}
			
			Queue<Integer> temp=A;
			A=B;
			B=temp;
			
	}
	
	public int pop() throws Exception
	{
		if(A.isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		size--;
		return A.remove();
		
	}
	
	public int top() throws Exception
	{
		if(A.isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		size--;
		int temp=A.peek();
		return temp;
	}
	*/
	
	//push Efficient
	
	public void push(int x)
	{
		A.add(x);
		size++;
	}
	
	public int pop()
	{
		while(A.size()!=1)
		{
			B.add(A.remove());
		}
		int rv=A.remove();
		Queue<Integer> temp=A;
		A=B;
		B=temp;
		return rv;
	}
	
	public int top()
	{
		while(A.size()!=1)
		{
			B.add(A.remove());
		}
		int rv=A.peek();
		B.add(A.remove());
		Queue<Integer> temp=A;
		A=B;
		B=temp;
		return rv;
	}
	
	
	
	
}
