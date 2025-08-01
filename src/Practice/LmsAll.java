package Practice;

import java.util.*;

public class LmsAll {

	public static void main(String[] args) {

//		String email = "satyagmail@.com";
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Your Mail Id: ");
		String email = sc.next();

		if (myCode(email)) {
			System.out.println("Valid Mail Id!!");
		} else
			System.err.print("Invalid Mail Id!!");
		;

	}

	static boolean myCode(String email) {

		for (int i = 0; i < email.length(); i++) {

			char ch = email.charAt(i);
			if (ch == '@') {
				return true;

			}
		}
		return false;
	}

}
