package All_Codes;

public class Advanced_Patterns {

	public static void main(String[] args) {
//		HollowRectangle(4, 5);
//		Inverted_half_pyramid(5, 5);
		Inverted_half_pyramid_num(5, 5);

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

}
