package multithreading;


	class Runnable1 implements Runnable{
		
		public void run()
		{
			while (true)
			{
				System.out.println("Runnable 1-----------");
			}
		}
	}

class Runnable2 implements Runnable{
		
		public void run()
		{
			while (true)
			{
				System.out.println("Runnable 2");
			}
		}
	}



public class MyRunnable {

	public static void main(String[] args) {
		
		Runnable1 r1=new Runnable1();
		Thread t1=new Thread(r1);
		Runnable2 r2=new Runnable2();
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		
		

	}

}
