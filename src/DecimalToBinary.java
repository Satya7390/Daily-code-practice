
import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {

		BinaryToDecimal();

//		Scanner sc = new Scanner(System.in);
//		System.out.println("\nWelocmes to the Converter of Decimal to Binary!!\n");
//
//		System.out.print("Please enter your number : ");
//		int num = sc.nextInt();
//		int n = num;
//
//		int bin = 0, rem, pow = 0;
//
//		while (num > 0) {
//			rem = num % 2;
//			bin = bin + rem * (int) (Math.pow(10, pow));
//			pow++;
//			num = num / 2;
//		}
//
//		System.out.print("Binary of the " + n + " is : " + bin);

		// ==========In Built-in function =========================//

//		String bin = Integer.toBinaryString(num);
//		System.out.print(bin);

	}

	public static void BinaryToDecimal() {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nWelocmes to the Converter of Binary To Decimal!!\n");

		System.out.print("Please enter your Binary Number : ");
		// int num = sc.next();
//		int n = num;

//		int dec = 0, pow = 0, rem;
//
//		while (num > 0) {
//			rem = num % 10;
//			dec = dec + rem * (int) (Math.pow(2, pow));
//			pow++;
//			num = num / 10;
//
//		}
//		System.out.print("Decimal of the " + n + " is : " + dec);
//		
		// ==========In Built-in function =========================//

		String num = sc.next();

		int dec = Integer.parseInt(num, 2); // convert binary to decimal
		System.out.print(dec);

	}
}
