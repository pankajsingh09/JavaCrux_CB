package OOPS;

public class Person {
	
//	String name;     // Default
//	int age; 			// Default
	
	private String name; 	
	private int age;
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
// }
	
	public Person() {
		// TODO Auto-generated constructor stub
	System.out.println("I am a non parameterized constructor");
	System.out.println(name+" "+age);
	}
	public Person(String name) {
		// TODO Auto-generated constructor stub
	System.out.println("I am a single parameterized Constructor");
	this.name=name;
	System.out.println(name+" "+age);
	}
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
	System.out.println("I am a double parameterized Constructor");
	this.name=name;
	this.age=age;
	System.out.println(name+" "+age);
	}
	
}
