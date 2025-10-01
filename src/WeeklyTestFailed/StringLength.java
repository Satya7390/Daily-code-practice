
//ProblemStatement
//Write a Java program to declare an array of strings and print the string
//that has the maximum length.

package WeeklyTestFailed;

import java.util.*;

public class StringLength {

	public static void main(String[] args) {

		String[] strArray = { "Java", "Python", "C++", "JavaScript", "PHP" };

		myCode(strArray);
	}

	public static void myCode(String[] strArray) {

		String maxStr = strArray[0];
		int maxLength = 0;

//		System.out.println(maxStr);

		for (int i = 0; i < strArray.length; i++) {
			int cnt = 0;

			char ch[] = strArray[i].toCharArray();
			for (char c : ch) {
				cnt++;
			}

			if (cnt > maxLength) {
				maxLength = cnt;
				maxStr = strArray[i];
			}
		}

		System.out.println("String with maximum length: " + maxStr);
		System.out.println("Length: " + maxLength);

	}

}