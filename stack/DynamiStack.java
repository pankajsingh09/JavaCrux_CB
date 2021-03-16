package stack;

public class DynamiStack extends Stack{
	
	public DynamiStack() {
		// TODO Auto-generated constructor stub
	super(Default_Capacity);
	}
	public DynamiStack(int capacity)
	{
		super(capacity);
	}
	
	public void push(int val) throws Exception
	{
		if(size()==this.data.length)
		{
			int[] arr=new int[this.data.length*2];
					for(int i=0;i<this.data.length;i++)
					{
						arr[i]=data[i];
					}
			this.data=arr;
		}
			super.push(val);
		
	}

}
