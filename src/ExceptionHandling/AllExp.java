package ExceptionHandling;

import java.util.Scanner;

public class AllExp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter 1 value");
//		int a = sc.nextInt();
//		System.out.println("Enter 2 value");
//		int b = sc.nextInt();
//
//		ThrowExp(a, b);

		try {
			System.out.println("Enter age to check valid for voting");
			ValidAge(sc.nextInt());
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public static void ThrowExp(int a, int b) {

		try {

			if (b == 0) {
				throw new Exception("Must be 2nd value > 0");
			}
			System.out.println("Result: " + (a / b));

		} catch (Exception e) {

			System.err.println(e);
		}
	}

	public static void ValidAge(int a) throws Exception {

//		try {
		if (a < 18) {
			throw new Exception("Please enter valid age to be eligible");
		}
		System.out.println("You're eligible for voting");
	}
//	catch (Exception e) {
//			System.err.println(e);
//		}
//	}

}
