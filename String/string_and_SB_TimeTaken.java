package String;

public class string_and_SB_TimeTaken {

	public static void main(String[] args) {

//		long start=System.currentTimeMillis();
//		System.out.println(start);
//		String s="hello";
//		for(int i=1;i<100000;i++)
//		{
//			s=s+i;
//		}
//		long end=System.currentTimeMillis();
//		System.out.println(end);
//		System.out.println(end-start);
		
		long start1=System.currentTimeMillis();
		System.out.println(start1);
		StringBuilder sb=new StringBuilder("hello");
		for(int i=1;i<100000;i++)
		{
			sb.append(i);
		}
		long end1=System.currentTimeMillis();
		System.out.println(end1);
		System.out.println(end1-start1);
		
	}

}
