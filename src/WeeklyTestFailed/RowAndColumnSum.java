
//Implement a program that will calculate the sum of each row and column of a
//two-dimensional array, arrayNum, of size 5x5. The array will be filled with
//random integers from 1 to 10. The program must print the sum in the proper
//format.

package WeeklyTestFailed;

import java.util.*;

public class RowAndColumnSum {

	public static void main(String[] args) {

		int[][] arrayNum = new int[5][5];
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arrayNum[i][j] = rand.nextInt(10) + 1; // numbers 1–10 (value will be genrated from 0 to 9)
			}
		}
		myCode(arrayNum);
	}

	// EndOfMainMethod

	public static void myCode(int[][] arrayNum) {

		// Print Array

		System.out.println("Array Printing\n");

		for (int i = 0; i < arrayNum.length; i++) {
			for (int j = 0; j < arrayNum.length; j++) {
				System.out.print(arrayNum[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Sum of Rows Printing");

		for (int i = 0; i < arrayNum.length; i++) {
			int RowSum = 0;
			for (int j = 0; j < arrayNum.length; j++) {
				RowSum += arrayNum[i][j];
			}
			System.out.println("Row " + (i + 1) + " Sum = " + RowSum);
		}

		System.out.println("Sum of Columns Printing");
		for (int j = 0; j < arrayNum.length; j++) {
			int ColSum = 0;
			for (int i = 0; i < arrayNum.length; i++) {
				ColSum += arrayNum[i][j];
			}
			System.out.println("Col " + (j + 1) + " Sum = " + ColSum);
		}

	}

}
