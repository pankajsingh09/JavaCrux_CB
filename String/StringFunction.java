package String;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
		String s="hello";
		System.out.println(s);
		System.out.println("Length of string "+s.length());
		System.out.println("char at 2 "+s.charAt(2));
		System.out.println("Substring from 1-4"+s.substring(1,4));//end value is excluded
		System.out.println("Substring from 2"+s.substring(2));
		System.out.println(s.concat(" Pankaj"));
		System.out.println(s.indexOf("l"));//from start
		System.out.println(s.lastIndexOf("l"));//from last
		System.out.println(s.startsWith("he"));
		System.out.println(s.startsWith("Hell"));
		System.out.println(s.equals("Hello"));
		System.out.println(s.equalsIgnoreCase("HELLO"));;
		String s1=new String("hello");
		System.out.println(s1==s);
		System.out.println(s1.equals(s1));
		
		
		
		
		
	}

}
