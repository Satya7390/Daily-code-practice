package ExceptionHandling;

import java.util.Scanner;

public class DivExp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 value");
		int a = sc.nextInt();
		System.out.println("Enter 2 value");
		int b = sc.nextInt();
		try {
			ThrowExp(a, b);

		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public static void ThrowExp(int a, int b) throws Exception {

		if (b == 0) {
			throw new Exception("Must be 2nd value > 0");
		}
		System.out.println("Result: " + (a / b));

	}

}
