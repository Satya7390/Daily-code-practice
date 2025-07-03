
import java.util.*;

public class Cal_Days {

	public static void main(String[] args) {

//		CalDays();
//		CalTimes();
//		Operators();
		Relational();
		// Logical();
//		Assignment();

//		int a = 100;
//		System.out.println((float)a); // 100.0
//		
//		float b = 10.98f;
//		System.out.println((int)b); // 10 data loss

	}

	public static void CalDays() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n Welcome to the Calculations of the Days!!\n");

		System.out.print("Enter your days : ");

		int days = sc.nextInt(); // 650

		int yr = days / 365; // 650/365 = 1
		int rem = days % 365; // 650%365 = 285

		int months = rem / 30; // 285/30 = 9
		int rem2 = rem % 30; // 285%30 = 15

		int weeks = rem2 / 7; // 15/7 = 2
		int rem3 = rem2 % 7; // 15%7 = 1

		int day = rem3 / 1; // 1/1 = 1

		System.out.println("Year = " + yr + " Months = " + months + " Weeks = " + weeks + " Total Days = " + day);

	}

	public static void CalTimes() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\n Welcome to the Calculations of the Times!!\n");
//
//		System.out.print("Enter your time in Seconds : ");
//
//		int Sec = sc.nextInt();

//		int min = Sec / 60;
//		int hr = min / 60;

//		System.out.print("Total Minutes is : " + min + " and Total Hours is : " + hr);

		System.out.print("\nNow enter your time in minutes to convert in hrs: ");

		System.out.print("Enter Your time in Mili-Seconds : ");

		long mili = sc.nextInt();
		long sec = mili / 1000;

		long min = sec / 60;
		long hr = min / 60;

		System.out.print("Total Time is : " + hr + " hrs " + min + " Minutes & " + sec + " Seconds");

	}

	public static void Operators() {

		int a = 2;
		System.out.println("\n A = " + a);
		System.err.println("PreInc : " + (++a)); // 3
		a++;// 3
		System.err.println("PostInc : " + a); // 4
		--a;
		System.err.println("PreDec : " + a); // 3
		a--;
		System.err.println("PostDec : " + a); // 2

//		int ab = -10;

		System.out.print("\n====Logical Operators====\n");

		int x = 10, y = 11;
		if (x == y) {
			System.out.println("True");
		} else {
			System.out.println("Flase");
		}

	}

	public static void Relational() {
		System.out.print("\n====Relational Operators====\n");

		Scanner sc = new Scanner(System.in);

		System.out.print("Tell me your 4 Subjects marks!!");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		float total_avg_marks = ( (a + b + c + d) / 4f);
		float avg = total_avg_marks / 4;

		System.out.println("Your total avg marks is : " + total_avg_marks);

		System.out.println("Now tell me the percentage % = ");

		double per = sc.nextDouble();

		if (per >= 90) {
			System.out.println("Congrats! You have passed the exam with Very Good marks");
		} else if (per >= 75) {
			System.out.println("Good job! You have passed with Good marks");
		} else if (per >= 60) {
			System.out.println("You passed with Average marks");
		} else {
			System.out.println("Sorry, you did not pass the exam");
		}
//		
//		float per = sc.nextFloat();

//		if(per >=90) {
//			System.out.println("Congrats you have passed the exam with Very Good marks");
//			else if (per>=75){
//				System.out.print("udgfursgiu");
//			}
//			else {
//				
//				System.out.print("udgfursgiu");
//			}
//		}

	}

	public static void Logical() {

		System.out.print("\n====Logical Operators====\n");

		int x = 10, y = 20;

		System.out.println("x > 10 && y > 20 = " + (x > 10 && y > 20)); // false
		System.out.print("x > 10 || y > 10 = " + (x > 10 || y > 10)); // true

	}

	public static void Assignment() {

		System.out.print("\n====Assignment Operators====\n");

		int a = 50;
		System.out.print("a += 5 = " + (a += 5)); // 55

	}

}
