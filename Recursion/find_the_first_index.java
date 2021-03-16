package Recursion;

public class find_the_first_index {

	public static void main(String[] args) {
		
		int []arr= { 3,6,11,5,19,5,27} ;
		int data=15;
		find_the_first_index s=new find_the_first_index();
		System.out.println(s.find(arr,0,data));

	}
	
	int find(int []arr , int si,int data) {
		
		if(si==arr.length-1 && arr[si]!=data)
		{
			return -1;
		}
		if(arr[si]==data)
			{
			return si;
			}
		else
		{
			int ans=find(arr, si+1,data);
			return ans;
		
		}
	}

}
