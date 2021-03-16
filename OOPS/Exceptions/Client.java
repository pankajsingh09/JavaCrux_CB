package OOPS.Exceptions;

public class Client {

  public static void main(String[] args) throws Exception {
	
	  Student s=new Student();
	  
	  s.setAge(-10);
	  System.out.println(s.getAge());
	  System.out.println(s.getName());
}

}
