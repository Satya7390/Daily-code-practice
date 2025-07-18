package Practice;

public class Patterns {

	public static void main(String[] args) {

//		Pattern_1();
//		Pattern_2();
//		Pattern_3();
//		Pattern_4();
//		Pattern_5();
//		Pattern_6();
//		Pattern_7();
//		Pattern_8();
//		Pattern_9();
//		Pattern_10();
		Pattern_11();

	}

	public static void Pattern_1() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

//		1
//		12
//		123
//		1234
//		12345
	}

	public static void Pattern_2() {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		*****
//		****
//		***
//		**
//		*

	}

	public static void Pattern_3() {

		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

//5
//54
//543
//5432
//54321

	}

	public static void Pattern_4() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	1
//	12
//	123
//	1234
//	12345
//	123456
//	1234567
//	12345678
//	123456789

	public static void Pattern_5() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	*
//	**
//	***
//	****
//	*****

	public static void Pattern_6() {

		for (int i = 9; i >= 1; i--) {
			for (int j = 9; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
//	
//	9
//	98
//	987
//	9876
//	98765
//	987654
//	9876543
//	98765432
//	987654321

	public static void Pattern_7() {

		for (int i = 9; i >= 1; i--) {
			for (int j = 9; j >= i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

//	9
//	88
//	777
//	6666
//	55555
//	444444
//	3333333
//	22222222
//	111111111

	public static void Pattern_8() {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

//	1
//	22
//	333
//	4444
//	55555
//	666666
//	7777777
//	88888888
//	999999999

	public static void Pattern_9() {

		for (int i = 1; i <= 5; i++) {
			for (int j = (5 - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 5; k >= 1; k--) {
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

	public static void Pattern_10() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

//	1
//	12
//	123
//	1234
//	12345
//	1234
//	123
//	12
//	1

	public static void Pattern_11() {

		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k <= (9 - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	//  1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	// 1 2 3 4 5
	// 1 2 3 4 5 6
	// 1 2 3 4 5 6 7
	// 1 2 3 4 5 6 7 8
	// 1 2 3 4 5 6 7 8 9

}
