package trees;
import java.util.*;
public class BinaryTree {
	
	private class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
	}
	
	private Node root=null;
	int size=0;

	BinaryTree()
	{
		Scanner sc=new Scanner(System.in);
		this.root=takeInput(sc,null,false);
	}
	
	private Node takeInput(Scanner s,Node parent,boolean isLeftOrRight)
	{
		if(parent==null)
		{
			System.out.println("Enter data for parent");
		}
		else
		{
			if(isLeftOrRight)
				System.out.println("Enter the data for left child of "+parent.data);
			else
				System.out.println("Enter the data for right child of "+parent.data);
		}
		
		int nodedata=s.nextInt();
		Node node=new Node(nodedata,null,null);
		this.size++;
		
		boolean choice=false;
		System.out.println("Do you have left child of "+node.data);
		choice=s.nextBoolean();
		if(choice)
		{
			node.left=takeInput(s, node, true);
		}
		
		choice=false;
		System.out.println("Do you have Right child of "+node.data);
		choice=s.nextBoolean();
		if(choice)
		{
			node.right=takeInput(s, node, false);
		}
		
		return node;
		
	}
	
	public void display()
	{
		display(this.root);
	}
	
	private void display(Node node)
	{
		String str="";
		if(node.left!=null)
		{
			str=str+node.left.data+"=>";
		}
		else
		{
			str=str+"END=>";
		}
		str=str+node.data;
		if(node.right!=null)
		{
			str=str+"<="+node.right.data;
		}
		else
		{
			str=str+"<=END";
		}
		
		System.out.println(str);
		
		if(node.left!=null)
		{
			this.display(node.left);
		}
		if(node.right!=null)
		{
			this.display(node.right);
		}
		
		
	}
	
	
	public int height()
	{
		return this.height(this.root);
	}
	
	private int height(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		int Lheight=this.height(node.left);
		int Rheight=this.height(node.right);
		
		int height=Math.max(Lheight, Rheight);
		return height+1;
	}
	
	public void preOrder()
	{
		System.out.print("PreOrder Traversal:-");
		this.preOrder(this.root);
		System.out.println();
	}
	
	private void preOrder(Node node)
	{
		if(node==null)
			return;
		
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	public void postOrder()
	{
		System.out.print("PostOrder Traversal:-");
		this.postOrder(this.root);
		System.out.println();
	}
	
	private void postOrder(Node node)
	{
		if(node==null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	
	public void InOrder()
	{
		System.out.print("InOrder Traversal:-");
		this.InOrder(this.root);
		System.out.println();
	}
	
	private void InOrder(Node node)
	{
		if(node==null)
			return;
		InOrder(node.left);
		System.out.print(node.data+" ");
		InOrder(node.right);
		
	}

	
	public void levelOrder()
	{
		System.out.print("Level Order Traversal:- ");
		this.levelOrder(this.root);
	}
	
	private void levelOrder(Node node)
	{
		LinkedList<Node> queue=new LinkedList<>();
	
		queue.add(node);
		while(!queue.isEmpty())
		{
			Node rv=queue.removeFirst();
			System.out.print(rv.data+" ");
			if(rv.left!=null)
			{
				queue.addLast(rv.left);
			}
			if(rv.right!=null)
			{
				queue.addLast(rv.right);
			}
			
		}
		System.out.println("END");
		
			
	}
	
	public boolean isBST()
	{
		return this.isBST(this.root,Integer.MIN_VALUE , Integer.MAX_VALUE);
	}
	
	private boolean isBST(Node node, int min,int max)
	{
		if(node==null)
			return true;
		
		if(node.data <min || node.data >max) {
			return false;
		}
		else if(! this.isBST(node.left, min, node.data)){
			return false;
		}
		else if(! this.isBST(node.right, node.data, max)) {
				return false;
			}
		return true;
		
		
		
	}
	
	public int DiameterOfTree()
	{
		return this.Diameter(this.root);
	}
	
	private int Diameter(Node node)
	{
		if(node==null)
			return 0;
		
		int case1=this.height(node.left)+this.height(node.right)+2;
		int case2=this.Diameter(node.left);
		int case3=this.Diameter(node.right);
		int myans=Math.max(case1,Math.max(case2,case3));
		return myans;
	}
	
	
	public int sumOfLeafNodes()
	{
		return this.sumOfLeafNodes(this.root);
		
	}
	
	private int sumOfLeafNodes(Node node)
	{
		if(node==null)
			return 0;
		if(node.left==null && node.right==null)
		{
			
			return node.data;
		}
		int l=sumOfLeafNodes(node.left);
		int r=sumOfLeafNodes(node.right);
		
		return l+r;
	}
	
}
