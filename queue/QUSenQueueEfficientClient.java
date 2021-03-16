package queue;

public class QUSenQueueEfficientClient {

	public static void main(String[] args) {
		
		QueueUsingStackEnqueEfficient q=new QueueUsingStackEnqueEfficient();
		for(int i=1;i<10;i++)
		q.enQueue(i*10);
		q.display();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		q.display();

	}

}
