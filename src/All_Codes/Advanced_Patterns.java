package All_Codes;

public class Advanced_Patterns {

	public static void main(String[] args) {
//		HollowRectangle(4, 5);
//		Inverted_half_pyramid(5, 5);
//		Inverted_half_pyramid_num(5, 5);
//		Floyds_triangle(5, 5);
//		Triangle_0_1(5, 5);
//		ButterFly(4);
//		Solid_rhombus(5);
//		Hollow_rhombus(5);
//		Palindrome(4);
		Diamond(5);

	}

	public static void HollowRectangle(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == 1 || i == row || j == 1 || j == col) { // (i,j)
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

//	* * * * * 
//	*       * 
//	*       * 
//	* * * * * 

	public static void Inverted_half_pyramid(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= (col - i); j++) {
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

	public static void Inverted_half_pyramid_num(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= ((col - i) + 1); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	12345
//	1234
//	123
//	12
//	1

	public static void Floyds_triangle(int row, int col) {
		int count = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 

	public static void Triangle_0_1(int row, int col) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print("1 ");

				else
					System.out.print("0 ");

			}
			System.out.println();
		}
	}

//	1 
//	0 1 
//	1 0 1 
//	0 1 0 1 
//	1 0 1 0 1 

	public static void ButterFly(int n) {

		// First Half
		for (int i = 1; i <= n; i++) {
			// for first half starts
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// for spaces
			for (int k = 1; k <= (2 * (n - i)); k++) {
				System.out.print(" ");
			}
			// for second half starts
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Second Half
		for (int i = n; i >= 1; i--) {
			// for first half starts
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// for spaces
			for (int k = 1; k <= (2 * (n - i)); k++) {
				System.out.print(" ");
			}
			// for second half starts
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

//	*      *
//	**    **
//	***  ***
//	********
//	********
//	***  ***
//	**    **
//	*      *

	public static void Solid_rhombus(int n) {
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = (n - i); j >= 1; j--) {
				System.out.print(" ");
			}
			// starts
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//    *****
//   *****
//  *****
// *****
//*****

	public static void Hollow_rhombus(int n) {
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// hollow rectangle
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

//    *****
//   *   *
//  *   *
// *   *
//*****

	public static void Palindrome(int n) {
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// palindrome logic for first half
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			// palindrome logic for second half
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	    1
//	   212
//	  32123
//	 4321234

	public static void Diamond(int n) {

		// first half
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// starts
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Second Half
		for (int i = n; i >= 1; i--) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// starts
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//
//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *
}
