package trees;

public class BST {
	
	private class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BST(int arr[])
	{
		this.root=construct(arr,0,arr.length-1);
	
	}

	private Node construct(int[] arr, int l, int h) {
		
		  if(l > h)
			return null;
		
		int mid=(l+h)/2;
		
		Node nn=new Node();
		nn.data=arr[mid];
		nn.left=construct(arr, l, mid-1);
		nn.right=construct(arr, mid+1, h);
		
		return nn;
	}
	
	public void display()
	{
		System.out.println("-------------");
		display(this.root);
		System.out.println("-------------");
	}
	
	private void display(Node node)
	{
		if(node==null)
			return;
		
		String str="";
		if(node.left==null)
			str=str+".";
		else
			str=str+node.left.data;
		
		str=str+"->"+node.data+"<-";
		
		if(node.right==null)
			str=str+".";
		else
			str=str+node.right.data;
		
		System.out.println(str);
		
		display(node.left);
		display(node.right);
	}
	
	
	public boolean find(int item)
	{
		return find(this.root,item);
	}
	
	private boolean find(Node node,int item)
	{
		if(node==null)
			return false;
		if(node.data > item)
		{
			return find(node.left,item);
		}
		else 
		if(node.data <item)
		{	
			return find(node.right,item);
		}
		else
		{
			return true;
		}
	}
	
	
	public void add(int item)
	{
		add(this.root,item);
	}
	private void add(Node node,int item)
	{
	
		if(node.data > item) {
		if(node.left==null)
		{
			Node nn=new Node();
			nn.data=item;
			
			node.left=nn;
		}
		else
		{
			add(node.left,item);
		}
		}
		else
		{
			
		if(node.right==null)
		{
			Node nn=new Node();
			nn.data=item;
			
			node.right=nn;
		}
		else
		{
			add(node.right,item);
		}
		}
	}
	
	public void max()
	{
		max(this.root);
	}
	private int max(Node node)
	{
		
		if(node.right==null)
		{
			return node.data;
		}
		return max(node.right);
	}
	
	
	public void remove(int item)
	{
		remove(this.root, item, null, false);
	}
	
	private void remove(Node node,int item,Node parent,boolean ilc)
	{	
		if(node==null)
			return;
		
		if(node.data >item)
		{
			remove(node.left, item, node, true);
		}
		else if(node.data <item)
		{
			remove(node.right, item, node, false);
		}
		else
		{
			
			//case1
			if(node.left==null && node.right==null)
			{
				if(ilc==true)
				{
					parent.left=null;
				}
				else
					parent.right=null;
			}
			//case2
			else if(node.left==null && node.right!=null)
			{
				if(ilc==true)
					parent.left=node.right;
				else
					parent.right=node.right;
			}
			//case3
			else if(node.left!=null && node.right==null)
			{
				if(ilc==true)
					parent.left=node.left;
				else
					parent.right=node.left;
			}
			//case4
			else
			{
				int max=max(node.left);
				node.data=max;
				
				remove(node.left, max, node, true);
			}
		}
	}
	
	
	
	
	
	
	

}
