package All_Codes;

import java.util.*;

public class AvgNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcomes to Find Average of Three Digits!!");

		System.out.print("Enter your First Number : ");
		double num1 = sc.nextInt();
		System.out.print("Enter your Second Number : ");
		double num2 = sc.nextInt();
		System.out.print("Enter your Third Number : ");
		double num3 = sc.nextInt();

		System.out.println("Average of Three Digits is : " + (average(num1, num2, num3)));

	}

	public static double average(double a, double b, double c) {
		return (a + b + c) / 3;

	}

}
