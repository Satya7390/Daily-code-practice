package Arrays;

import java.util.Iterator;

public class All_Arr {

	public static void main(String[] args) {

//		Pos_Neg();
//		Even_odd_count();
//		Copy_arr();
//		Copy_even_odd();
		Report_duplicate();
//		Report_dupCopy();
//		Report_duplicate2();
//		Report_duplicate2_copy();
//		Pair_Of_Two();
//		Pair_Of_Three();
//		Basic_Asc_Sort();
//		Basic_Dsc_Sort();

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

	public static void Report_duplicate() {

		int a[] = { 1, 2, 1 };

		for (int i = 0; i < a.length; i++) { // 0<3 | 1<3 | 2<3 3<3f

			int cnt = 0;

			for (int j = i + 1; j < a.length; j++) { // 1<3 2<3 3<3f | 2<3 3<3f | 3<3f

				if (a[i] == a[j]) { // 1 == 2f , 1 == 1 true | 2 == 1f

					cnt++; // 1 // 0
				}
			}
			if (cnt == 0) { // 1 == 0 f | 0 == 0t, 0 == 0 t

				System.out.print(a[i] + " "); // 2 1
			}
		}
	}

	public static void Report_dupCopy() {

		int a[] = { 1, 2, 1 };
		int cnt1 = 0;
		int index = 0;

		for (int i = 0; i < a.length; i++) { // 0<3 | 1<3 | 2<3 3<3f

			int cnt = 0;

			for (int j = i + 1; j < a.length; j++) { // 1<3 2<3 3<3f | 2<3 3<3f | 3<3f

				if (a[i] == a[j]) { // 1 == 2f , 1 == 1 true | 2 == 1f

					cnt++; // 1 // 0
				}
			}
			if (cnt == 0) { // 1 == 0 f | 0 == 0t, 0 == 0 t

				cnt1++;
//				System.out.print(a[i] + " "); // 2 1

			}

		}

		int b[] = new int[cnt1];

		for (int i = 0; i < a.length; i++) { // 0<3 | 1<3 | 2<3 3<3f

			int cnt = 0;

			for (int j = i + 1; j < a.length; j++) { // 1<3 2<3 3<3f | 2<3 3<3f | 3<3f

				if (a[i] == a[j]) { // 1 == 2f , 1 == 1 true | 2 == 1f

					cnt++; // 1 // 0
				}
			}
			if (cnt == 0) { // 1 == 0 f | 0 == 0t, 0 == 0 t

				b[index] = a[i];
				index++;

			}

		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

	// Second Way of Report dulicate
	public static void Report_duplicate2() {

		int a[] = { 1, 2, 1, 3, 4, 5, 2, 1 };

		for (int i = 0; i < a.length; i++) { // 0<8t | 1<8t | 2<8t | 3<8t 4<8t 5<8t 6<8t 7<8t 8<8f
			int cnt = 0;
			for (int j = 0; j < i; j++) { // 0<0f| 0<1t 1<1f| 0<2t 1<2t | 0<3t 1<3t 2<3t | 0<4t 1<4t 2<4t 3<4t |
											// 0<5...4<5t | 0<6..5<6t | 0<7

				if (a[i] == a[j]) { // 1==2f | 1 === 1t 1==2f | 3 == 1f 3==2f 3==1f | 4 == 1f 4==2f 4==1f 4==3f | 5
									// == 1...5==4f| 2 == 1..2==2t,2==2t | 1 == 1t..2timestrue
					cnt++;// 0| 1 |0 | 0 |0|2 |3
				}
			}
			if (cnt == 0) { // 0==0t | 0==0t | 1==0f | 0==0t | 0==0t|1==0f|2==0f
				System.out.print(a[i] + " "); // 1 2 3 4 5
			}
		}

	}

	public static void Report_duplicate2_copy() {

		int a[] = { 1, 2, 1, 3, 4, 5, 2, 1 };
		int cnt1 = 0;

		System.out.println("\n👇 Original Array 👇\n");

		for (int i = 0; i < a.length; i++) { // 0<8t | 1<8t | 2<8t | 3<8t 4<8t 5<8t 6<8t 7<8t 8<8f
			int cnt = 0;
			for (int j = 0; j < i; j++) { // 0<0f| 0<1t 1<1f| 0<2t 1<2t | 0<3t 1<3t 2<3t | 0<4t 1<4t 2<4t 3<4t |
											// 0<5...4<5t | 0<6..5<6t | 0<7

				if (a[i] == a[j]) { // 1==2f | 1 === 1t 1==2f | 3 == 1f 3==2f 3==1f | 4 == 1f 4==2f 4==1f 4==3f | 5
									// == 1...5==4f| 2 == 1..2==2t,2==2t | 1 == 1t..2timestrue
					cnt++;// 0| 1 |0 | 0 |0|2 |3
				}
			}

			if (cnt == 0) { // 0==0t | 0==0t | 1==0f | 0==0t | 0==0t|1==0f|2==0f
				System.out.print(a[i] + " "); // 1 2 3 4 5
				cnt1++;
			}
		}

		int index = 0;
		int b[] = new int[cnt1];

//		System.out.println("\n" + b.length);

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {

				if (a[i] == a[j]) {
					cnt++;
				}
			}
			if (cnt == 0) {
				b[index] = a[i];
				index++;
			}
		}

		System.out.println("\n👇 Copy of Array 👇\n");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

	public static void Pair_Of_Two() {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					continue;
				}

				if (a[i] + a[j] <= 10) {
					System.out.println(a[i] + " " + a[j] + " = " + (a[i] + a[j]));
//					System.out.println(a[i] + " " + a[j]);
				}
			}
		}
	}

	public static void Pair_Of_Three() {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				for (int k = 0; k < a.length; k++) {

					if (a[i] == a[j] && a[j] == a[k]) {
						continue;
					}
					if (a[i] + a[j] + a[k] <= 10) {
						System.out.println(a[i] + " " + a[j] + " " + a[k] + " = " + (a[i] + a[j] + a[k]));
					}

				}

			}
		}
	}

	public static void Basic_Asc_Sort() {
		int a[] = { 11, 22, 33, 44, 23 };
		System.out.print("\n Ascending Order\n ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

			System.out.print(a[i] + " ");
		}
	}

	public static void Basic_Dsc_Sort() {
		int a[] = { 11, 22, 33, 44, 23 };
		System.out.print("\n Descending Order\n ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

			System.out.print(a[i] + " ");
		}
	}

}
