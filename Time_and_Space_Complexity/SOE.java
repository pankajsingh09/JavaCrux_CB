package Time_and_Space_Complexity;

public class SOE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soe(25);
	}

	public static void soe(int n)
	{
		boolean [] arr=new boolean[n+1];
		arr[0]=arr[1]=true;
		for(int table=2;table*table<=n;table++)
		{
			if(arr[table]==true)
			{
				continue;
			}
			for(int num=2;table*num<=n;num++)
			{
				arr[table*num]=true;
			}
		}
		
		for(int i=0;i<=n;i++)
		{
			if(arr[i]==false)
			{
				System.out.println(i);
			}
		}
	}
}
