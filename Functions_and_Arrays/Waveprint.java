package Functions_and_Arrays;

public class Waveprint {

	public static void main(String[] args) {
		int [][]arr= {{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},
				{41,42,43,44}};
				
				int top=0;
				int bottom=arr.length-1;
				int left=0;
				int right=arr.length-1;
				int dir=1;
				
				while(top<=bottom)
				{
					if(dir==1)
					{
						for(int i=left;i<=right;i++)
						{
							System.out.println(arr[top][i]+"  ");
						}
						dir=2;
						top++;
					}
					if(dir==2)
					{
						for(int i=right;i>=left;i--)
						{
							System.out.println(arr[top][i]+"  ");
						}
						dir=1;
						top++;
					}
				}

	}

}
