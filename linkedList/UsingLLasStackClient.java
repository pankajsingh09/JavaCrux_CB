package linkedList;

public class UsingLLasStackClient {

	public static void main(String[] args) throws Exception {
		
		UsingLLasStack stack=new UsingLLasStack();
		 
		for(int i=1;i<=5;i++)
		stack.push(i*10);
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		stack.display();

	}

}
