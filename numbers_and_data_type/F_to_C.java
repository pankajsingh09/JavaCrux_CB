package numbers_and_data_type;

import java.util.Scanner;

public class F_to_C {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int fmin=sc.nextInt();
		int fmax=sc.nextInt();
		int fstep=sc.nextInt();
		int fcurrent=fmin;
		while(fcurrent<=fmax)
		{
			int celsius=(int)((5.0f/9.0f)*(fcurrent-32));
			
			System.out.println(fcurrent+"\t"+celsius);
			fcurrent+=fstep;
		}
	}

}
