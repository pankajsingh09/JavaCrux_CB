package challenges_fundamental_and_patterns;

import java.util.Scanner;

public class Sol_Pattern_inverted_Housrglass {

	public static void main(String[] args) {
			
		Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int rows = 2 * n + 1;  // Number of rows

        int nst = 1;                 // initializing number of numbers in a row
        int nsp = 2 * n - 1;     // initializing number of spaces in a row 
        for (int row = 1; row <= rows; row++) {
            int val = n;

             //work for numbers
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + " ");
                val--;
            }

            //work for spaces
                for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("  ");
            }

            int cst = 1;
            if (row == n + 1) {
                cst = 2;
                val += 2;
            } else {
                cst = 1;
                val++;
            }

             //work for numbers
            for (; cst <= nst; cst++) {
                System.out.print(val + " ");
                val++;
            }


            //preparation for next row
            if (row <= n) {
                nsp -= 2;
                nst++;
            } else {
                nsp += 2;
                nst--;
            }
            System.out.println();
        }
		
	
	}

}
