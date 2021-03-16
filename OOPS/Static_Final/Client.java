package OOPS.Static_Final;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Student []student=new Student[100];
		
		for(int i=0;i<student.length;i++)
		{
			student[i]=new Student(i+" th");
			System.out.println(Student.getnoOfStudent());
		}

		System.out.println(student[25].rollNo);
		student[25].setName("ABC");
		System.out.println(student[25].getName());
		
		student[30].setUniformColor("GREEN");
		System.out.println(Student.getUniformColor());
		
		student[30].nonStaticfunc();
		student[30].staticfunc();
		Student.staticfunc();
	}

}
