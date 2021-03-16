package OOPS.Static_Final;

public class Student {
	
	
	public final int rollNo;
	private static String name;
	

	public void setName(String name) throws Exception
	{
		if(name=="" ||name==null)
		{
			throw new Exception("Name can't be null or empty");
		}
		
		Student.name=name;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	private static int noOfStudent=0;
	
	
	public static int getnoOfStudent()
	{
		return Student.noOfStudent;
	}
	
	private static String uniformColor="White";
	
	public static void setUniformColor(String color)
	{
		Student.uniformColor=color;
	}
	public static String getUniformColor()
	{
		return Student.uniformColor;
	}
	
	public static final int Max_Student=100;
	 
	public Student(String name) throws Exception
	{
		if(Student.noOfStudent==Student.Max_Student)
		{
			throw new Exception("Max limit Reached");
		}
		this.setName(name);
		Student.noOfStudent++;
		this.rollNo=Student.noOfStudent;
		
	}
	
	public void nonStaticfunc()
	{
		System.out.println(this.name+" says hi to "+Student.noOfStudent);
	}
	
	public static void staticfunc()
	{
		System.out.println(Student.name+" says hi to "+Student.noOfStudent);
	}

}
