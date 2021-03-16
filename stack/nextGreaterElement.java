package stack;

import java.util.Stack;

public class nextGreaterElement {
	public static void main(String[] args) throws Exception {
		
	
	
	int [] arr= {2,1,3,8,6,7,5};
	
//	Stack1 s =new Stack1(10);
	Stack<Integer> s=new Stack<>();
	
	for(int i=0;i<arr.length;i++)
	{
		while(!s.isEmpty() && arr[i]>s.peek())
		{
			int temp=s.pop();
			System.out.println(temp+"->"+arr[i]);
		}
		
		s.push(arr[i]);
	}
	while(!s.isEmpty())
	{
		int temp=s.pop();
		System.out.println(temp+"-> -1");
	}
	}
		

}
