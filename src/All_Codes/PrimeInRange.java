package All_Codes;

import java.util.*;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcomes to Find Prime Number!!");

		System.out.print("Enter your Number : ");
		int num1 = sc.nextInt();

		System.out.print("Enter your Second Number : ");
		int num2 = sc.nextInt();

		System.out.print("\nHere is your prime Numbers!!\n");
		primeInRange(num1, num2);

	}

	public static boolean isPrime(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) { // Optimised Way

			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

	public static void primeInRange(int n1, int n2) {

		int count = 0;

		for (int i = n1; i <= n2; i++) {

			if (isPrime(i)) {
				count++;

				System.out.print(" " + i);
			}

		}
		System.out.println();
		System.out.println("Total Prime Numbers is : " + count);
	}

}
