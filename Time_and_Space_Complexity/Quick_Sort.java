package Time_and_Space_Complexity;

public class Quick_Sort {
	
	public static void main(String[] args) {
		
		int arr[]= {50,10,73,25,62,5,18,92,49};
		QuickSort(arr, 0, arr.length-1);
		
		for(int val:arr)
		{
			System.out.println(val);
		}
		
	}
	
	public static void QuickSort(int[] arr,int lo,int hi)
	{
		if(lo>=hi)
		{
			return;
		}
		
		int left=lo;
		int right=hi;
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		
		while(left<=right)
		{
			while(arr[left]<pivot)
			{
				left++;
			}
			while(arr[right]>pivot)
			{
				right--;
			}
			if(left<=right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			
		}
		
		QuickSort(arr, lo, right);
		QuickSort(arr, left, hi);
	}

}
