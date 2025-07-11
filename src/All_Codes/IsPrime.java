package All_Codes;

import java.util.*;

public class IsPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcomes to Find Prime Number!!");

		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();

		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();

		if (num1 < 2) {
			System.err.println("Your First Number should be Greater than 1 !!");
		} else {
			System.out.print("\nHere is your prime Numbers!!\n");
			IsPrime(num1, num2);
		}

	}

	public static void IsPrime(int n1, int n2) {

		int totalCount = 0;

		for (int j = n1; j < n2; j++) {
			int count = 0;

			for (int i = 2; i < j; i++) {

				if (j % i == 0) {
					count++;

				}

			}
			if (count == 0) {
				totalCount++;
				System.out.print(" " + j);
			}

		}
		System.out.println();
		System.out.println("Total Prime Number Count is: " + totalCount);
	}

}
