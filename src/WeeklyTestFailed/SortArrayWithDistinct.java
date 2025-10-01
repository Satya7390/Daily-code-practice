//ProblemStatement
//Create a method that will sort an array of integers in non-decreasing order
//and print all the distinct elements in the array. The elements in the input
//array will be passed via input parameters.

package WeeklyTestFailed;

import java.util.Arrays;

public class SortArrayWithDistinct {

	public static void main(String[] args) {
		int[] array = { 34, 12, 24, 12, 5, 2, 24, 34, 51, 24, 5 };

		myCode(array);

	}

	// EndofMainMethod
	public static void myCode(int[] array) {

		// Arrays.sort(array); (in built hai let's code with own mind)
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {

//			System.out.print(array[i] + " ");

			if (i == 0 || array[i] != array[i - 1]) {

				System.out.print(array[i] + " "); // 2 5 12 24 34 51

			}
		}

	}

}