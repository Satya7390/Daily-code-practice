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
		pattern_4(row, col);

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
			for (int j = (b-1); j >= i; j--) {
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


}
