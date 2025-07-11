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
//		Days();
//		AdditionUpToN();
//		FactNum();
//		Internet_Speed();
//		GCD_OF_Two_Num();
//		PrimeNum();
//		DigitCount();
//		DivBility();
//		UperLower();
//		AgeGroup();
//		SaleTarget();
//		PrintPrime(); 
//		EvenOddSum();
//		NestedLoops();
//		NestedEvenOdd();

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
		int num1 = sc.nextInt();
		System.out.print("Enter your Number: ");
		int num2 = sc.nextInt();

//		if (num <= 1)
//			System.err.print("\nPlease Enter valid Numbers!!\n");
		int primeCount = 0;

		if (num1 <= 1) {
			System.err.print("Your First Number should be Greater Than 1 ");
		} else {
			System.out.println("\n Here is your Prime Number!!");
			for (int j = num1; j < num2; j++) {
				int count = 0;

				for (int i = 2; i < j; i++) { // Also we can use this short-cuts for (int i = 2; i <= Math.sqrt(num);
												// i++)
												// //
												// for (int i = 2; i < num/2; i++)
					if (j % i == 0) {
						count++;
					}
				}
				if (count == 0) {
					primeCount += 1;
					System.out.print(" " + j);
				}
			}
			System.out.println();
			System.out.print("Total prime numbers is : " + primeCount);
		}

//		else
//			System.out.println("Number isn't Prime!!");
	}

	public static void DigitCount() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelocomes to Find Digit in Numbers!!\n");

		System.out.print("Enter your Number: ");
		int num = sc.nextInt();

		int count = 0;
		while (num > 0) {
			int last = num % 10;
			count++;
//			System.out.print(count);
			num /= 10;
		}
		System.out.print("Your total Digit Count is: " + count);
	}

	public static void DivBility() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelocomes to Find Divisibility BY 5 & 10\n");

		System.out.print("Enter your Number: ");
		int num = sc.nextInt();

		if (num % 5 == 0 && num % 10 == 0)
			System.out.println("Divisible");
		else
			System.out.print("Not Divisible");

	}

	public static void UperLower() {

//		'A' to 'Z' in ASCII: 65 to 90
//
//		'a' to 'z' in ASCII: 97 to 122

		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelocomes to Find Uper & Lower Case \n");

		System.out.print("Enter your Sentences: ");
		char ch = sc.next().charAt(0);

		if (ch >= 65 && ch <= 90)
			System.out.print("Upercase ");
		else if (ch >= 97 && ch <= 122)
			System.out.print("Lowercase ");
		else
			System.out.print("Invalid");

	}

	public static void AgeGroup() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelocomes to Find Your Age Group!!\n");

		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();

		if (age <= 12)
			System.out.println("Child");
		else if (age <= 18)
			System.out.println("Teenager");
		else if (age <= 60)
			System.out.println("Adult");
		else
			System.out.println("Senior");

	}

	public static void SaleTarget() {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("\nWelocomes to Find Your Target Status!!\n");
//
//		System.out.print("Enter Your Sales Price: ");
//		int sl = sc.nextInt();
//		System.out.print("Now, Enter Your Target Price: ");
//		int tg = sc.nextInt();
//
//		if (sl >= tg)
//			System.out.println("Tagrget Achieved!!");
//		else
//			System.out.println("Tagrget Not Achieved Yet!!");
//
//	}

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Salutation : ");

		String Salutation = sc.nextLine();

		if (Salutation.equals("Mr"))
			System.out.println("Hello Sir!!");
		else if (Salutation.equals("Mrs"))
			System.out.println("Hello Ma'am!!");
		else
			System.out.println("Invalid Input");

	}

	public static void PrintPrime() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome to printing the prime Numbers!!\n");

		System.out.print("Enter your two numbers which you wants to print Prime In Between : ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		for (int j = num1; j <= num2; j++) {
			int count = 0;

			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(j);
			}
			// else {
//				System.out.println("Not prime");
//			}
		}

	}

	public static void EvenOddSum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome to Sum of Even & Odd!!\n");

		System.out.print("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum1 = 0;
		int sum2 = 0;

		for (int i = num1; i <= num2; i++) {

			if (i % 2 == 0) {
				sum1 += i;
//				System.out.println(i);

			} else {
				sum2 += i;
//				System.out.println(i);
			}

		}

		System.out.println("Even sum is: " + sum1);
		System.out.println("Odd sum is: " + sum2);

	}

	public static void NestedLoops() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome in The Nested if else Loops!!\n");

		System.out.print("Enter your Three numbers to find Greatest : ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is Greatest");

			} else {
				System.out.println(num3 + " is Graeter ");

			}

		} else {
			if (num2 > num3) {
				System.out.println(num2 + " is Gretest");

			} else {
				System.out.println(num3 + " is Greatest");
			}
		}

	}

	public static void NestedEvenOdd() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome in The Nested if else Loops to find +-Ve Even & Odd!!\n");

		System.out.print("Enter your Number : ");

		int num = sc.nextInt();

		if (num > 0) {

			if (num % 2 == 0) {
				System.out.println("+ve Even");
			} else
				System.out.println("+ve Odd");

		} else {
			if (num < 0) {
				if (num % 2 == 0) {
					System.out.println("-ve Even");
				} else
					System.out.println("-v Odd");
			} else
				System.out.println("Zero");
		}

	}

}
