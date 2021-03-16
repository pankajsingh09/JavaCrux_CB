package OOPS.Exceptions;

public class Student {
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) throws Exception  {
		if(age<0)
		{
			throw new Exception("Age can't be negative");
		}
		this.age = age;
	}
	
}
