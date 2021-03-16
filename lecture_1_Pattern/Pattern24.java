package lecture_1_Pattern;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int n = sc.nextInt();

		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int x = 1;
		while (row <= n) {
			//or x=row
			for (int i = 1; i <= nsp; i++) {
				System.out.print("\t");
			}

			for (int i = 1; i <= nst; i++) {
				System.out.print(x + "\t");
			}

			System.out.println();
			nsp--;
			nst += 2;
			row++;
			x++;

		}
	}

}
