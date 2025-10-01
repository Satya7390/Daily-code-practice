package CollectionsAll;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQue4 {

	public static void main(String[] args) {
		PriorityQueue<Integer> t = new PriorityQueue<Integer>();
		t.add(24);
		t.add(23);
		t.add(20);
		t.add(17);

		// First Way to fetch all element

		int sum = 0;
		for (Integer integer : t) {
			sum += integer;
			System.out.print(integer + " ");
		}
		System.out.println("Sum is: " + sum);

		System.out.println();
		// Second Way to fetch all element

//		int n = t.size();
//		for (int i = 0; i < n; i++) {
//			System.out.print(t.poll() + " ");
//		}

//		System.out.println("============");
//		// Third Way to fetch all element
//		while (!t.isEmpty()) {
//			System.out.print(t.poll() + " ");
//		}
	}

}
