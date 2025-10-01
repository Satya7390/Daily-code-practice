package Strings;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter 1 value: ");
			int a = sc.nextInt();
			System.out.print("Enter 2 value: ");
			int b = sc.nextInt();
			System.out.print("Sum: " + (a + b));
		} catch (Exception e) {
			System.err.println("Please Enter Numeric Numbers!!");
		} finally {
			System.err.println("This Finally Block and it also works even if Input mismatch");
		}
	}

}
