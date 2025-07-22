package Control_Statement;

import java.util.*;

public class Patterns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcomes in the Patterns Printing!!");

		System.out.print("Enter no of Rows: ");
		int row = sc.nextInt();
		System.out.print("Enter no of Colomns: ");
		int col = sc.nextInt();
//		pattern_1(row, col);
//		pattern_2(row, col);
//		pattern_3(row, col);
//		pattern_4(row, col);
//		pattern_5(row, col);
//		pattern_6(row, col);
//		pattern_7(row, col);
		pattern_8(row, col);

	}

	public static void pattern_1(int a, int b) {

		for (int i = 1; i <= a; i++) {
			for (int j = b; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	*****
//	*****
//	*****
//	*****
//	*****

	public static void pattern_2(int a, int b) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 

	public static void pattern_3(int a, int b) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= a; i++) {
			for (int j = b; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*

	public static void pattern_4(int a, int b) {

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= a; i++) {
			for (int j = (b - 1); j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 

	public static void pattern_5(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = (a - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

//    *
//   **
//  ***
// ****
//*****

	public static void pattern_6(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= (i - 1); j++) {
				System.out.print(" ");
			}
			for (int k = b; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
//	
//	*****
//	 ****
//	  ***
//	   **
//	    *

	public static void pattern_7(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = (a - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = (b - 1); k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	
//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *

	public static void pattern_8(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = (b - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= a; i++) {
			for (int j = (i + 1 - 1); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = (a - i); k >= 1; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
// * * * * 
//  * * * 
//   * * 
//    * 
     

}
