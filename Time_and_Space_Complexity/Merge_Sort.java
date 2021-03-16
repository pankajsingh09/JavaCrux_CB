package Time_and_Space_Complexity;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int arr[]= {40,5,26,65,10,70,31,54};
			int []ans=merge(arr, 0, arr.length-1);
			
			for(int val:ans)
			{
				System.out.print(val+" ");
			}

	}
	
	public static int[] merge(int []arr,int l,int h)
	{
		if(l==h)
		{
			int [] br=new int[1];
			br[0]=arr[l];
			return br;
		}
		
		int mid=(l+h)/2;
		int[] lh=merge(arr, l, mid);
		int[] uh=merge(arr, mid+1, h);
		
		int[] merged=mergetwoarray(lh, uh);
		return merged;
	}
	
	public static int[] mergetwoarray(int[] arr1,int[] arr2)
	{
		int [] merge=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if( arr1[i] <= arr2[j])
			{
				merge[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				merge[k]=arr2[j];
				j++;
				k++;
			}
		}
		
		if(i==arr1.length)
		{
			while(j<arr2.length)
			{
				merge[k]=arr2[j];
				k++;
				j++;
			}
		}
		if(j==arr2.length)
		{
			while(i<arr1.length)
			{
				merge[k]=arr1[i];
				k++;
				i++;
			}
		}
		
		return merge;
	}

}
