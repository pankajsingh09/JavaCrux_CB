package OOPS.Exceptions;

public class Student1 {
	
	private int age;
	
	public void setAge(int age) throws Exception{
		if(age<0)
		{
			throw new Exception("Age can't be negative");
		}
		this.age=age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	

}
