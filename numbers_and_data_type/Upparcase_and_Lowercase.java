package numbers_and_data_type;

import java.util.Scanner;

public class Upparcase_and_Lowercase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the character : ");
		char c=sc.next().charAt(0);
		if(c>='A' && c<='Z')
		{
			System.out.println("It is an Uppar case character : ");
		}
		else if(c>='a' && c<='z')
		{
			System.out.println("It is an Lower case character : ");
		}
		else
		{
			System.out.println("it is an invalid character : ");
		}

	}

}
