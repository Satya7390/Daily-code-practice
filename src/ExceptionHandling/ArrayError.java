package ExceptionHandling;

import java.util.Scanner;

public class ArrayError {

	public static void main(String[] args) {

		int a[] = { 11, 32, 0, 35, 23, 56, 78, 90 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Index number to perform Calculations!!\n");
			System.out.println("Enter first Index : ");
			int x = sc.nextInt();
			System.out.println("Enter second Index: ");
			int y = sc.nextInt();

			System.out.println("Add: " + (a[x] + a[y]));
			System.out.println("Sub: " + (a[x] - a[y]));
			System.out.println("MUl: " + (a[x] * a[y]));
			System.out.println("Div: " + (a[x] / a[y]));
			System.out.println("Mod: " + (a[x] % a[y]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Please Enter Index between 0 to " + (a.length - 1));
		} catch (ArithmeticException e) {
			System.err.println("Can't Divisible by Zero!!");
		} finally {
			System.out.println("This is finally block");
		}

	}

}
