package OOPS.Exceptions;

public class client1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		Student1 s1=new Student1();
		try {
			s1.setAge(20);	
			System.out.println("Inside try block");
		}
		catch (Exception z){
			System.out.println("Inside catch Block");
		}
		System.out.println("Bye");
		System.out.println(s1.getAge());

	}

}
