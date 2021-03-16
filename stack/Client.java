package stack;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Stack o=new Stack();
//		o.push(5);
//		o.push(8);
//		o.display();
//		System.out.println(o.size());
//		o.pop();
//		o.pop();
////		o.pop();
		
		Stack s=new DynamiStack();
//		System.out.println(s.size());
		for(int i=1;i<10;i++)
		{
			
			s.push(i*10);
			s.display();
			System.out.println(s.size());
		}
		for(int i=1;i<6;i++)
		{
			
			s.push(i*10);
			s.display();
			System.out.println(s.size());
		}
	     
		
		
	}

}
