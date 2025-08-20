package Arrays;

public class All_Arr {

	public static void main(String[] args) {

//		Pos_Neg();
//		Even_odd_count();
//		Copy_arr();
		Copy_even_odd();

	}

	public static void Pos_Neg() {

		int a[] = { -11, 2, -3, 4, 0, -5, 6, -7, 8, -9, -10 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] < 0) {
				System.out.print(a[i] + " ");
			}
		}
		for (int i = 0; i < a.length; i++) {

			if (a[i] >= 0) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public static void Even_odd_count() {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int even_cnt = 0, odd_cnt = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				even_cnt++;
			} else {

				odd_cnt++;

			}
		}

		System.out.println("Total Even Count: " + even_cnt);
		System.out.println("Total Odd Count: " + odd_cnt);

	}

	public static void Copy_arr() {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];
//			System.out.print(b[i] + " ");
		}
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}

	}

	public static void Copy_even_odd() {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int b[] = new int[a.length];
		int index = 0;
//		int even_cnt = 0, odd_cnt = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				b[index] = a[i];
				index++;
			}
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				b[index] = a[i];
				index++;
			}
		}
		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}

	}

}
