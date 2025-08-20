package Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int a1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int a2[][] = new int[2][3];
		int sum = 0, sub = 0, mul = 1, div = 1, mod = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
				a2[i][j] = a[i][j] + a1[i][j];
				System.out.print(a2[i][j] + " ");
//				a2[i][j] = a[i][j] - a1[i][j];
//				System.out.print(a2[i][j] + " ");
			}

		}

//		System.out.println("Sum of the Array: " + a2[i][j]);

	}

}
