package Strings;

import java.util.Scanner;

public class PalindromeStr {

	public static void main(String[] args) {

		System.out.print("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev += str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println(rev + " is Palindrome String");
		} else {
			System.out.println(rev + " is not a Palindrome String");
		}
//		System.out.println(rev);
//		if()

	}

}
