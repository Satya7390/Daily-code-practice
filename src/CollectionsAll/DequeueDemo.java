package CollectionsAll;

import java.util.ArrayDeque;

public class DequeueDemo {

	public static void main(String[] args) {

		ArrayDeque a = new ArrayDeque();
		a.add(12);
		a.add(23);
		a.add("abc");
		a.add(1.2);
		a.add(12);
//		a.add(null);
		System.out.println(a);

	}

}
