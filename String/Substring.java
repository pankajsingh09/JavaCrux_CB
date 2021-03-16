package String;

public class Substring {

	public static void main(String[] args) {
		
		String s="ABCD";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.subSequence(i, j));
			}
		}

	}

}
