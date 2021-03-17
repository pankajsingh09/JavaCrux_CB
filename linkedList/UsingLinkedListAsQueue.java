package linkedList;

public class UsingLinkedListAsQueue  {

		private LinkedList list=new LinkedList();
		
		public void enQueue(int data)
		{
			list.addLast(data);
		}
		
		public int deQueue() throws Exception
		{
			return list.removeFirst();
		}
		
		public int getFront() throws Exception
		{
			return list.getFirst();
		}
		
		public int size()
		{
			return list.size();
		}
		
		public boolean isEmpty()
		{
			return list.size()==0;
		}
		
		public void display()
		{
			list.display();
		}
		
	
	
}
