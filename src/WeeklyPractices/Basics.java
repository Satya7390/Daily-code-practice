package WeeklyPractices;

import java.util.Scanner;

//Basics of Java
//
//1.Write a program to print the ASCII value of a given character.
//
//2.Find the largest of three numbers without using if-else (use ternary operator).
//
//3.Swap two numbers without using a third variable.
//
//4.Write a program to check whether a number is prime or not.
//
//5.Write a program to find the factorial of a number using recursion.

public class Basics {

	public static void main(String[] args) {
//		AsciiValue();
//		LargeOfThree();
//		Swapping();
//		PrimeCheck();
//		Fact();

	}

	public static void AsciiValue() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character : ");
		char ch = sc.next().charAt(0);

		System.out.println("ASCII Value of " + ch + " is: " + (int) (ch));

	}

	public static void LargeOfThree() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int max = ((num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3));

		System.out.println("Maximum of 3 is: " + max);
	}

	public static void Swapping() {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping a = " + a + " and b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping a = " + a + " and b = " + b);

	}

	public static void PrimeCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check prime: ");
		int num = sc.nextInt();
		int cnt = 0;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				cnt++;
			}
		}

		if (cnt == 0) {
			System.out.println("Your Enter number is prime");
		} else {
			System.err.println("Your Enter number is not  prime");
		}
	}

	public static void Fact() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find Factorial: ");
		int num = sc.nextInt();

		for (int i = num; i >= 2; i--) {
			num *= (i - 1);
		}
		System.out.print("Factorial is: " + num);

	}

}
