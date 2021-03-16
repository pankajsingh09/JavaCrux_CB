package OOPS.Inheritance;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---case1---");
		P obj1=new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();
		
		System.out.println("---case2---");
		P obj2=new C();
		//data members of the reference will called 
		// writing the code -> Compiler -> LHS
		System.out.println(obj2.d);
		System.out.println(((C)obj2).d);
		System.out.println(obj2.d1);
		System.out.println(((C)obj2).d2);
		//Member Function of the instance will called 
		// Execute the code -> JVM -> RHS
		obj2.fun();
		obj2.fun1();
		((P)obj2).fun();  // Only fun function of  C class will called
		((C)obj2).fun2();
		

		
		System.out.println("---case3---");
		C obj3=new C();
		System.out.println(obj3.d);
		System.out.println(obj3.d1);
		System.out.println(obj3.d2);
		System.out.println(((P)obj3).d);
		
		obj3.fun();
		obj3.fun1();
		obj3.fun2();
		((P)obj3).fun();  // Only fun function of  C class will called
		
		
		System.out.println("---case4---");
//		C obj4=new P();
//
//		System.out.println(obj4.d);
//		System.out.println(obj4.d1);
//		System.out.println(obj4.d2);  //it will give runtime error
		//Compile time errors are much better than run time errors
		//This is not allowed in java because at the time writing the code we can access more 
		//data members whereas in time of execution we could not access some data members
		
		
	}

}
