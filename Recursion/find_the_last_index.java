package Recursion;

public class find_the_last_index {

	public static void main(String[] args) {
		
		int []arr= { 3,6,11,5,19,27} ;
		int data=15;
		find_the_last_index s=new find_the_last_index();
		System.out.println(s.find(arr,0,data));

	}
	
	int find(int []arr , int si,int data) {
		int A=-1;
		if(si==arr.length-1 && arr[si]!=data)
		{
			return A;
		}
		
		if(arr[si]==data)
			{
			A=si;
			}
			int B=find(arr, si+1,data);
			    if(A>B)
			    	return A;
			    else
				    return B;
	}

}
