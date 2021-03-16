package stack;

public class client1 {

	public static void main(String[] args) throws Exception {
		
		Stack1 s=new Stack1(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.peek());
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.display();
		s.pop();
		s.display();
		s.pop();
	}

}
