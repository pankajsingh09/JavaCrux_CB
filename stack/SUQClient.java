package stack;

public class SUQClient {

	public static void main(String[] args) throws Exception {
		
//		StackUsingQueueEnqueEfficeint s=new StackUsingQueueEnqueEfficeint();
		SUQdequeuEfficient s=new SUQdequeuEfficient();
		for(int i=1;i<=5;i++)
		s.push(i*10);
		
			s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.top());
	}

}
