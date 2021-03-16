package linkedList;

public class ClientLL {

	public static void main(String[] args) throws Exception {
		
		LinkedList list=new LinkedList();
		
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		list.addFirst(50);                     
		list.display();
		System.out.println("Size->"+list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.getAtIndex(3));
		list.addAt(60, 4);
		list.display();
		System.out.println("Size->"+list.size());
		System.out.println(list.removeFirst());
		list.display();
		System.out.println("Size->"+list.size());
		System.out.println(list.removeLast());
		list.display();
		System.out.println("Size->"+list.size());
		list.addFirst(70);
		list.addLast(80);
		list.display();
		System.out.println("Size->"+list.size());
		System.out.println(list.removeAt(2));
		list.display();
		System.out.println("Size->"+list.size());
		list.addAt(90,4);
		list.display();
		System.out.println("Size->"+list.size());
		list.reverseData();
		list.display();
		System.out.println("Size->"+list.size());
		list.reversePointer();
		list.display();
		System.out.println("Size->"+list.size());
		System.out.println("Mid :- "+list.mid());
		list.removeLast();
		list.display();
		System.out.println("Size->"+list.size());
		System.out.println(list.mid());
		

	}

}
