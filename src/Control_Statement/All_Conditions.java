package Control_Statement;

import java.util.*;

public class All_Conditions {

	public static void main(String[] args) {

//		IfChecks(); 
//		EvenOdd();
//		GreatesNumbers();
//		System.out.print(Add_of_Two_Numbers(5,6));
//		Print_Table();
//		LastDigit();
//		CalGrade();
		Days();
//		AdditionUpToN();
//		FactNum();
//		Internet_Speed();
//		GCD_OF_Two_Num();
//		PrimeNum();

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
		System.out.println("\nEnter your two numbers which you wants to find Even & Odd");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("\nHere is your Even Nymbers!!\n");

		int EvenCount = 0;

		for (int i = num1; i <= num2; i++) {

			if (i % 2 == 0) {
				System.out.print(" " + i);
				EvenCount++;
			}

		}
		System.out.println();

		System.out.print("\nTotal Even Count is: " + EvenCount + "\n");

		System.out.println("\n=====================================================\n");

		System.out.println("\nHere is your Odd Nymbers!!\n");

		int OddCount = 0;

		for (int i = num1; i <= num2; i++) {

			if (i % 2 != 0) {
				System.out.print(" " + i);
				OddCount++;
			}

		}
		System.out.println();
		System.out.print("\nTotal Odd Count is: " + OddCount);

	}

	public static void GreatesNumbers() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Greatest of three number find!!\n");

		System.out.print("Enter your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter your second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter your third number: ");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is Greater number!!");

		} else if (num2 > num3) {
			System.out.println(num2 + " is Greater number!!");
		} else
			System.out.print(num3 + " is Greater number!!");
	}

	public static int Add_of_Two_Numbers(int a, int b) {

		int sum = a + b;
		return sum;

	}

	// ====================Closing if-else Statement====================

	// =================Use of For loops=========================

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
//	=======Outputs=========
//	Welcomes to Print Table!!
//
//	Enter your  number which you wants to print table: 5
//
//	Your Table is Ready Now!!
//
//	5 x 1 = 5
//	5 x 2 = 10
//	5 x 3 = 15
//	5 x 4 = 20
//	5 x 5 = 25
//	5 x 6 = 30
//	5 x 7 = 35
//	5 x 8 = 40
//	5 x 9 = 45
//	5 x 10 = 50

	// ================================//

	public static void LastDigit() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to filter Last Digits Numbers!!\n");
		System.out.println("\nEnter your two numbers which you wants to find last digit In Between!!");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("\nHere is your Filter Numbers!\n");

		for (int i = num1; i <= num2; i++) {

			if (i % 10 == 7) {
				System.out.print(" " + i);
			}

		}

	}

	public static void CalGrade() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Find Grade of Your Marks!!\n");

		System.out.print("Enter your Percentage Marks :  ");
		int per = sc.nextInt();

		if (per > 100) {
			System.err.println("\nPlease Enter your exact Percentage In Between 0 to 100");
		}

		else if (per >= 90 && per < 100) {
			System.out.println("Well done Your Grade is A !!");

		} else if (per >= 75 && per < 90) {
			System.out.println("Good to see!! Your Grade is B !!");
		} else if (per >= 60 && per < 75) {
			System.out.println("Good but need to improvement, Your Grade is C !!");
		} else if (per >= 35 && per < 60) {
			System.out.println("Plz Work hard Your Grade is D !!");
		} else {
			System.out.println("You have been failed in your exams!!");
		}
	}

//	public static void Days() {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("\nWelcomes to Find Days!\n");
//
//		System.out.print("Enter your number of Days:  ");
//		int dy = sc.nextInt();
//
//		switch (dy) {
//		case 1:
//			System.out.print("Day is Monday");
//			break;
//		case 2:
//			System.out.print("Day is Tuesday");
//			break;
//		case 3:
//			System.out.print("Day is Wednesday");
//			break;
//		case 4:
//			System.out.print("Day is Thursday");
//			break;
//		case 5:
//			System.out.print("Day is Friday");
//			break;
//		case 6:
//			System.out.print("Day is Saturday");
//			break;
//		case 7:
//			System.out.print("Day is Sunday");
//			break;
//		default:
//			System.err.println("Please Enter Number Between 1 to 7 !!");
//		}
//
//	}

	public static void Days() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Find Days!\n");

		System.out.print("Enter your number of Days:  ");
		int dy = sc.nextInt();

		String Days = switch (dy) {
		case 1 -> " Day is Monday";
		case 2 -> " Day is Tuesday";
		case 3 -> " Day is Wednesday";
		case 4 -> " Day is Thursday";
		case 5 -> " Day is Friday";
		case 6 -> " Day is Saturday";
		case 7 -> " Day is Sunday";
		default -> "Please Enter Number Between 1 to 7 !!";
//		case 2:
//			System.out.print("Day is Tuesday");
//			break;
//		case 3:
//			System.out.print("Day is Wednesday");
//			break;
//		case 4:
//			System.out.print("Day is Thursday");
//			break;
//		case 5:
//			System.out.print("Day is Friday");
//			break;
//		case 6:
//			System.out.print("Day is Saturday");
//			break;
//		case 7:
//			System.out.print("Day is Sunday");
//			break;
//		default:
//			System.err.println("Please Enter Number Between 1 to 7 !!");
		};
		System.out.print(Days);

	}

	public static void AdditionUpToN() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Additions till the Last Digit!!\n");

		System.out.print("Enter your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter your second number: ");
		int num2 = sc.nextInt();

		int sum = 0;

		for (int i = num1; i <= num2; i++) { // 1<=1 true....11<10 false
			sum += i;

//			System.out.print(" " + sum);

		}

		System.out.print("Sum is: " + sum);

	}

	public static void FactNum() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcomes to Find Factorial!!\n");

		System.out.print("Enter your number which you wants to find factorial: ");
		int num = sc.nextInt();

		int fact = 1;

		if (num > 0) {
//			System.out.println("Your number is +ve");
			if (num % 2 == 0) {

				for (int i = 1; i <= num; i++) {
					fact *= i;
				}
				System.out.println("Factorial of " + num + " is " + fact);
			} else
				System.out.println("Your number is Odd");

		} else if (num < 0) {
			System.out.println("Your number is -ve");
		} else
			System.out.println("Your number is Zero");

	}

	public static void Internet_Speed() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelcomes to the Space of Speed Meter!!\n");

		System.out.print("Enter your Internet Speed in MB/Sec to know the Speed Quality : ");
		int sp = sc.nextInt();

		if (sp < 5) {
			System.out.println("Speed is Very Slow!!");
		} else if (sp < 10) {
			System.out.println("Speed is Slow!!");
		} else if (sp < 30) {
			System.out.println("Speed is Average!!");
		} else if (sp < 50) {
			System.out.println("Speed is Fast!!");
		} else {
			System.out.println("Speed is Very Fast!!");
		}

	}

	public static void GCD_OF_Two_Num() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelocomes to Find the GCD of Two Numbers!!\n");

		System.out.print("Enter your First Number: ");
		int num = sc.nextInt();
		System.out.print("Enter your Second Number: ");
		int num1 = sc.nextInt();

		int min = num;
		if (num1 < num) {
			min = num1;
		}
//		System.out.print(min);

		for (int i = min; i >= 1; i--) {

			if (num % i == 0 && num1 % i == 0) {
				System.out.print(" GCD is : " + i);
				break;
			}

		}
	}

	public static void PrimeNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelocomes to Find the Prime Number!!\n");

		System.out.print("Enter your Number: ");
		int num = sc.nextInt();

		if (num <= 1)
			System.err.print("\nPlease Enter valid Numbers!!\n");
		int count = 0;

		for (int i = 2; i < num; i++) { // Also we can use this short-cuts for (int i = 2; i < Math.sqrt(num); i++) //
										// for (int i = 2; i < num/2; i++)
			if (num % 2 == 0) {
				count++;
			}
		}
		if (count == 0)
			System.out.println("Number is Prime!!");
		else
			System.out.println("Number isn't Prime!!");
	}

}
