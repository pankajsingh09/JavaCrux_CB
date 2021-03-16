package linkedList;

public class LinkedList {
		
	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	//O(1)
	public void addFirst(int data)
	{
		Node nn=new Node();
		nn.data=data;
		
		if(this.size >=1)
		{
			nn.next=head;
		}
		
		if(this.size >=1)
		{
			this.head=nn;
			this.size++;
		}
		else
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
	}
	//O(1)
	public void addLast(int data)
	{
		//Node creation
		Node nn=new Node();
		nn.data=data;
		nn.next=null;
		
		//	Attachments
		if(this.size>=1)
		{
			this.tail.next=nn;
		}
		
		//	Summary Objects
		if(size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			this.tail=nn;
			this.size++;
		}
		
	}
	//O(1)
	public int getFirst() throws Exception
	{
		if(head==null)
			throw new Exception("List is Empty.");
		else
			return this.head.data;
	}
	//O(1)
	public int getLast() throws Exception
	{
		if(tail==null)
		{
			throw new Exception("List is Empty.");
		}
		else 
			return this.tail.data;
	}
	//O(n)
	public int getAtIndex(int index) throws Exception
	{
		if(this.size==0)
			throw new Exception("List is Empty.");
		
		if(index<0 || index>=size)
			throw new Exception("Invalid Index.");
		
		Node temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	//O(n)
	public void addAt(int data,int index) throws Exception
	{
		if(index <0 || index >size)
			throw new Exception("Invalid Index");
		
		if(index==0)
			addFirst(data);
		else if(index==size)
			addLast(data);
		else
		{
			Node nn=new Node();
			nn.data=data;
			nn.next=null;
			Node nm1=getNodeAtIndex(index-1);
			Node np1=nm1.next;
			nm1.next=nn;
			nn.next=np1;
			size++;
			
		}
	}
	//O(n)
    private Node getNodeAtIndex(int index) throws Exception
	{
		if(this.size==0)
			throw new Exception("List is Empty.");
		
		if(index<0 || index>=size)
			throw new Exception("Invalid Index.");
		
		Node temp=head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
    //O(1)
    public int removeFirst() throws Exception
    {
    	if(size==0)
    	{
    		throw new Exception("List is Empty");
    	}
    	int temp=this.head.data;
    	if(size==1)
    	{
    		this.head=null;
    		this.tail=null;
    		this.size=0;
    	}
    	else
    	{
    		this.head=head.next;
    		size--;
    	}
    	return temp;
    	
    }
    //O(1)
    public int removeLast() throws Exception
    {
    	if(size==0)
    	{
    		throw new Exception("List is Empty");
    	}
    	
    	int temp=tail.data;
    	
    	if(size==1)
    	{
    		head=null;
    		tail=null;
    		size=0;
    	}
    	else
    	{
    		Node nm2=this.getNodeAtIndex(size-2);
    		tail=nm2;
    		nm2.next=null;
    		size--;
    	}
    	return temp;
    }
    //O(n)
    public int removeAt(int index) throws Exception
    {
    	if(this.size==0)
    		throw new Exception("List is Empty");
    	if(index <0 || index >=size)
    		throw new Exception("Invalid index");
    	
    	if(index==0)
    		return removeFirst();
    	else if(index==size-1)
    		return removeLast();
    	else
    	{
    		Node nm1=getNodeAtIndex(index-1);
    		Node nm=nm1.next;
    		Node np1=nm.next;
    		nm1.next=np1;
    		nm.next=null;
    		this.size--;
    		return nm.data;
    		
    	}
    
    
    }
    //O(1)
    public int size()
    {
    	return this.size;
    }
    //O(n^2)
    public void reverseData() throws Exception
    {
    	if(size==0)
    		throw new Exception("List is Empty");
    	
    	if(size==1)
    		return;
    	else
    	{
    		int i=0;
    		int j=size-1;
    		while(i<j)
    		{
    			Node m=getNodeAtIndex(i);
    			Node n=getNodeAtIndex(j);
    			int temp=m.data;
    			m.data=n.data;
    			n.data=temp;
    			i++;
    			j--;
    		}
    	}
    	
    }
     //O(n)
	public void display()
	{	
		System.out.println("-------------------");
		Node temp=this.head;
		while(temp != null)
		{
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(".");
		System.out.println("-------------------");
	}
	
	public void reversePointer()
	{
		Node prev=this.head;
		Node cur=prev.next;
		
		while(cur != null)
		{
			Node ahead=cur.next;
			cur.next=prev;
			
			prev=cur;
			cur=ahead;
			
		}
		
		Node t=head;
		head=tail;
		tail=t;
		
		tail.next=null;
	}
	
	public int mid()
	{
		Node temp=head;
		Node forw=head;
		while(forw.next!=null && forw.next.next!=null)
		{
			temp=temp.next;
			forw=forw.next.next;
		}
		return temp.data;
	
	}
	
	
}
