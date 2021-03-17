package linkedList;

public class UsingLL_AsQueueClient {
	
	public static void main(String[] args) throws Exception {
		UsingLinkedListAsQueue q=new UsingLinkedListAsQueue();
		for(int i=1;i<=5;i++)
		{
			q.enQueue(i*10);
		}
		
		q.display();
		System.out.println(q.deQueue());
		System.out.println(q.getFront());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		q.display();
	}

}
