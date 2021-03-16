package Time_and_Space_Complexity;

public class Sort_0_1_2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,1,0,2,1,0,2};
		int []ans=sort(arr);
		for(int val:ans)
		{
			System.out.print(val+" ");
		}
	}
	
	public static int[] sort(int []arr)
	{
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				//Swap mid and low elements and increment mid and low index
				swap(arr,mid,low);
				mid++;
				low++;
			}
			else if(arr[mid]==1)
			{
				//increment mid index
				mid++;
			}
			else
			{
				//swap mid and high elements and decrement high index
				swap(arr,mid,high);
				high--;
			}
		}
			
		return arr;
	}
	
			public static void swap(int[] arr,int i,int j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

}
