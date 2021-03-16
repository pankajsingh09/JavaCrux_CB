package stack;

public class reverseStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack s=new Stack();
		Stack h=new Stack();
		for(int i=1;i<=5;i++)
			s.push(i*10);
		s.display();
		reverseStack r=new reverseStack();
		r.reverse(s,h,0);
		s.display();
		

	}
	
	public  void reverse( Stack s,Stack h,int index) throws Exception
	{
		if(s.isEmpty())
			return;
		int val=s.pop();
		reverse(s, h, index+1);
		h.push(val);
		if(index==0)
		{
			while(!h.isEmpty())
				s.push(h.pop());
		}
		
		
	}

}
