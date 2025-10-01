
//ProblemStatement
//Write a Java program that fills an array with random numbers.

package WeeklyTestFailed;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		myCode(numbers);

	}

	public static void myCode(int[] array) {

		Random rn = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = rn.nextInt(100) + 1;
			System.out.print(array[i] + " ");
		}

//		for (int i : array) {
//			System.out.print(i + " ");
//		}

	}

}