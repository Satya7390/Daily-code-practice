package WeeklyPractices;

import java.util.Scanner;

//Control & Conditional Statements

//
//1.Print the Fibonacci series up to n terms using a loop.
//
//2.Write a program to check whether a number is Armstrong or not.
//
//3.Print all numbers from 1 to 100 that are divisible by 3 and 5 but not by 15.
//
// There will be no numbers in the range 1 to 100 that are divisible by 3 and 5 
//but not by 15, because any number divisible by both 3 and 5 is always divisible by 15.
//4.Create a calculator using switch-case.

public class ControlSt {

	public static void main(String[] args) {
//		Fibonacci();
		ArmStrong();
//		Cal();
	}

	public static void Fibonacci() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Series of Fibonacci: ");
		int num = sc.nextInt();

		int a = 0, b = 1;

		for (int i = 1; i <= num; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}

	}

//	public static void ArmStrong() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number to check Armstrong: ");
//		int num = sc.nextInt();
//		int dub = num;
//		int cnt = 0;
//
////		while (num > 0) {
////			cnt++;
////			int rem = num % 10;
////			num /= 10;
////		}
////		System.out.println(num);
//		System.out.println(num.va);
//
//	}

	public static void Cal() {
		Scanner sc = new Scanner(System.in);
	}

}
