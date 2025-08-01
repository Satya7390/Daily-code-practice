package Control_Statement;

import java.util.*;

public class Patterns {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcomes in the Patterns Printing!!");

		System.out.print("Enter no of Rows: ");
		int n = sc.nextInt();

//		System.out.print("Enter no of Rows: ");
//		int row = sc.nextInt();
//		System.out.print("Enter no of Colomns: ");
//		int col = sc.nextInt();
//		pattern_1(row, col);
//		pattern_2(row, col);
//		pattern_3(row, col);
//		pattern_4(row, col);
//		pattern_5(row, col);
//		pattern_6(row, col);
//		pattern_7(row, col);
//		pattern_8(row, col);
//		pattern_9(n);
//		pattern_10(n);
//		pattern_11(n);
//		pattern_12(n);
//		pattern_13(n);
//		pattern_14(n);
//		pattern_15(n);
//		pattern_16(n);
//		pattern_17(n);
//		pattern_18(n);
//		pattern_19(n);
//		pattern_20(n);
//		pattern_21(n);
//		pattern_22(n);
//		pattern_23();
		pattern_24(n);

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

		for (int i = a - 1; i >= 1; i--) {
			for (int j = (b - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
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

	public static void pattern_9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
//	1 2 3 4 5 6 

	public static void pattern_10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 

	public static void pattern_11(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 

	public static void pattern_12(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}

//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10

	public static void pattern_13(int n) {
		// first half
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
// second half
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 

	public static void pattern_14(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i + 1; j >= 1; j--) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

//	5 4 3 2 1 
//	4 3 2 1 
//	3 2 1 
//	2 1 
//	1 

	public static void pattern_15(int n) {

//		System.out.println(1 + 2 + "3");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 

	public static void pattern_16(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}
			for (int j = i - 1; j >= 1; j--) {

				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

//	1 
//	1 2 1 
//	1 2 3 2 1 
//	1 2 3 4 3 2 1 
//	1 2 3 4 5 4 3 2 1

	public static void pattern_17(int n) {

		for (int i = 1; i <= n; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) { // 1 <= 1......n<= n

				System.out.print(num + " "); // 1....n
				num += n - j; //
			}
			System.out.println();
		}

	}

//	1 
//	2 6 
//	3 7 10 
//	4 8 11 13 
//	5 9 12 14 15 

	public static void pattern_18(int n) {

		for (int i = 1; i <= n; i++) {

			char ch = 'A';

			for (int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}

	}

//	A 
//	A B 
//	A B C 
//	A B C D 
//	A B C D E 

	public static void pattern_19(int n) {
		for (int i = n; i >= 1; i--) {

			char ch = 'A';

			for (int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}

	}

//	A B C D E 
//	A B C D 
//	A B C 
//	A B 
//	A 

	public static void pattern_20(int n) {
		char ch = 'A';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}

	}

//	A 
//	B C 
//	D E F 
//	G H I J 
//	K L M N O

	public static void pattern_21(int n) {
		char ch = 'A';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	}

//	A 
//	B B 
//	C C C 
//	D D D D 
//	E E E E E

	public static void pattern_22(int n) {

		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
				if (ch == 'C')
					ch = 'A';
			}
			System.out.println();
		}
	}

//	A 
//	A B 
//	A B A 
//	A B A B 
//	A B A B A 

	public static void pattern_23() {

		for (char i = 'D'; i >= 'A'; i--) {

			for (char j = i; j >= 'A'; j--) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

//	D C B A 
//	C B A 
//	B A 
//	A

	public static void pattern_24(int n) {
		char ch = 'A';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}

		// second half
		ch = 'D';
		for (int i = n - 1; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(ch + " ");
			}
			ch--;
			System.out.println();
		}
	}

}