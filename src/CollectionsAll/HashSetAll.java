package CollectionsAll;

import java.util.HashSet;

public class HashSetAll {

	public static void main(String[] args) {
		RemoveDuplicates();
	}

	public static void RemoveDuplicates() {
		int a[] = { 1, 2, 1, 3, 3, 4, 5, 4 };

		HashSet<Integer> h1 = new HashSet<Integer>();

		for (int i : a) {
			h1.add(i);
		}

		System.out.println(h1); // [1, 2, 3, 4, 5] it means HashSet allow automatic to remove dupliicates coz it
								// contains only unique key values
	}

}
