package queue;

public class Client {

	public static void main(String[] args) throws Exception {
			
		Queue q=new Queue(5);
//		Queue2 q=new Queue2(5);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.display();
		System.out.println(q.deQueue());
		q.enQueue(60);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.enQueue(70);
		q.display();
		System.out.println(q.size());
	}

}
