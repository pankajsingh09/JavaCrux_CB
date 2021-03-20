package abstraction;

abstract class Parent {
	
	public Parent()
	{
		System.out.println("Constructor of parent");
	}
	
	public void greet()
	{
		System.out.println("Greet from Parent");
	}
	
	abstract public void sayHello();

}

		abstract class base extends Parent
		{
			public void bye() {
				System.out.println("Say bye");
			}
		}
		
		class Base1 extends base{

			@Override
			public void sayHello() {
				System.out.println("Hello");				
			}
			public void sleep()
			{
				System.out.println("sleeping");
			}
			
		}
		
		public class Abstraction {
			public static void main(String[] args) {
				System.out.println("starts");
				Base1 b=new Base1();
				b.bye();
				b.greet();
				b.sayHello();
				b.greet();
				b.sleep();
				
//				Parent p=new Parent(); -->Error
//				base bs=new base(); --->
				
				Parent p=new Base1();
				p.greet();
				p.sayHello();
				
			}
			
		}
