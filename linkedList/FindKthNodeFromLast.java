package linkedList;

public class FindKthNodeFromLast {
		
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		for(int i=1;i<=5;i++)
			list.addLast(i*10);
		list.display();
		System.out.println(list.KthNodeFromEnd(3));
		
	}
}
