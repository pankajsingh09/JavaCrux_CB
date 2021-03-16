package queue;

public class ReverseQueue {

	public static void main(String[] args) throws Exception {
	
		Queue q=new Queue(10);
		for(int i=1;i<=6;i++)
		{
			q.enQueue(i*10);
		}
		q.display();
		reverse(q);
		q.display();
		

	}
	
	public static void reverse(Queue q) throws Exception
	{
		if(q.isEmpty())
			return;
		int element=q.deQueue();
		reverse(q);
		q.enQueue(element);
	}

}
