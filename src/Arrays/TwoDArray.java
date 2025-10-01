package Arrays;

public class TwoDArray {

	public static void main(String[] args) {
//		CenterEle();
//		HollowEle();
		SubArr();

	}

	public static void CenterEle() {
		int a[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 4, 5, 6, 7 }, { 8, 9, 2, 1 } };

		for (int i = 1; i < a.length - 1; i++) {
			for (int j = 1; j < a.length - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void HollowEle() {
		int a[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 4, 5, 6, 7 }, { 8, 9, 2, 1 } };
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (i == 0 || j == 0 || i == a.length - 1 || j == a.length - 1) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

	public static void SubArr() {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int k = 3;

		for (int i = 0; i < a.length - k + 1; i++) {

			for (int j = i; j < i + k; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
	}

}
