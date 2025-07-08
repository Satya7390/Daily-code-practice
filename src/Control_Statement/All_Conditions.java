package Control_Statement;

import java.util.*;

public class All_Conditions {

	public static void main(String[] args) {

//		IfChecks(); 
//		EvenOdd();
//		GreatesNumbers();

//		System.out.print(Add_of_Two_Numbers(5,6));
		Print_Table();

	}

	// ====================Starting if-else Statement
	// ================================//

	public static void IfChecks() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nHii Welcomes in the voting!!\n");
		System.out.print("Please enter your age : ");

		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("You can go for vote!!");
		} else {
			System.out.print("Sorry you're not eligble for the vote!!\n");
		}

	}

	public static void EvenOdd() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Even & Odd Programms!!\n");
		System.out.print("Enter your number: ");

		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Your given number is Even!!");
		} else
			System.out.print("Your given number is Odd!!");
	}

	public static void GreatesNumbers() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Greatest number find!!\n");

		System.out.print("Enter your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter your second number: ");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " is Greater number!!");
		} else
			System.out.print(num2 + " is Greater number!!");
	}

	public static int Add_of_Two_Numbers(int a, int b) {

		int sum = a + b;
		return sum;

	}

	public static void Print_Table() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Print Table!!\n");

		System.out.print("Enter your  number which you wants to print table: ");
		int num = sc.nextInt();
		System.out.println("\nYour Table is Ready Now!!\n");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

	// ====================Closing if-else Statement
	// ================================//

}
