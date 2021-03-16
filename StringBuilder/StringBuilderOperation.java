package StringBuilder;

public class StringBuilderOperation {

	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder();
		s.append("HELLO");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		s.setCharAt(3, 'p');
		System.out.println(s);
		s.append("PANKAj");
		System.out.println(s);
		//Append insert at the end whereas insert add at the index no.
		s.insert(2, "S");
		System.out.println(s);
		s.deleteCharAt(3);
		System.out.println(s);
		s.delete(5, s.length());
		System.out.println(s);
		//StrindBuilder to String
		
		String s1=s.toString();
		
		//String to StringBuilder
		
		String str="HELLO";
		StringBuilder sb=new StringBuilder(str);
		
		
	}

}
