
//How can you compare two lists in Java?

package WeeklyTestFailed;

import java.util.*;

public class CompareList {

	// StartOfMainMethod
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cherry");

		List<String> list2 = new ArrayList<String>();
		list2.add("Apple");
		list2.add("Banana");
		list2.add("Cherr");

		myCode(list1, list2);
	}
	// EndOfMainMethod

	public static void myCode(List<String> list1, List<String> list2) {

		if (list1.equals(list2)) {
			System.out.println("Both lists are equal");
		} else {
			System.out.println("Lists are NOT equal");

		}
	}

}
