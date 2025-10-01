package Strings;

import java.util.*;

class demo extends Thread {

	public void run() { // predefined method
		System.out.println("Get");
	}

}

public class AllStrings {

	public static void main(String[] args) {

//		Char_Rev();
//		Str_Rev();
//		VowelCnt();
//		Larg_Small_find();
//		IndexNum();
//		SumOfDigits();
//		RemoveSpace();

		// Thread -> Predefined class
		// currentTread() -> use to have address of current thread
		// getName() -> use to get name of current threads address
		System.out.println(Thread.currentThread().getName());// main

		demo d = new demo();
		d.start();

	}

	public static void Char_Rev() {

		String str = "Hello Satya, WhatsApp!!";

		char ch[] = str.toCharArray();

		System.out.println("\n 👇 Original String is 👇\n" + str);
		System.out.print("\nReverse is: ");

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]); // !!ppAstahW ,aytaS olleH
		}
	}

	public static void Str_Rev() {

		String str = "Hello_Satya, WhatsApp!!";

		String st[] = str.split("_");

		System.out.println("\n 👇 Original String is 👇\n" + str);
		System.out.print("\nReverse is: ");

		for (int i = st.length - 1; i >= 0; i--) {
			System.out.print(st[i] + " "); // Satya, WhatsApp!! Hello // Hello Satya, WhatsApp!! => Hello Satya,
											// WhatsApp!!
		}
	}

	public static void VowelCnt() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String to count vowels: ");
		String str = sc.nextLine();
		str = str.toLowerCase();

		char ch[] = str.toCharArray();
		int vcnt = 0;
		int constcnt = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vcnt++;

			} else {
				constcnt++;
			}

		}

		System.out.println("\nString length: " + ch.length);
		System.out.println("\nTotal Vowel Count is: " + vcnt);
		System.out.println("\nTotal Consonent Count is: " + constcnt);
	}

//	public static void Larg_Small_find() {
//
//	}

	public static void IndexNum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();

//		char ch[] = str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//
//			System.out.println(i + " -> " + ch[i]);
//		}
//		

//		Or
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			System.out.println(i + " -> " + ch);
		}
	}

	public static void SumOfDigits() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		int sum = 0;
		String str1 = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {

				sum += Character.getNumericValue(ch);
			} else {
				str1 += ch;
			}
		}

		System.out.println("Digit Sum: " + sum);
		System.out.println("String: " + str1);
	}

	public static void RemoveSpace() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		int sum = 0;
//		String str1 = "";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch != ' ') {
				System.out.print(ch + " ");
			}
		}

	}

}
