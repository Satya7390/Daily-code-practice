package CollectionsAll;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet h1 = new LinkedHashSet();

		h1.add(10);
		h1.add(10);
		h1.add(1.2);
		h1.add("abc");
		h1.add(null);

		System.out.println(h1); // [10, 1.2, abc, null]
//		System.out.println(h1.contains(1.2)); // true

//		h1.remove(1.2);
//		System.out.println(h1); // [10, abc, null]

//		h1.clear();
//		System.out.println(h1); //[]

//		System.out.println(h1.size()); // 4

//		System.out.println(h1.isEmpty()); // false

		LinkedHashSet h2 = new LinkedHashSet();
//
//		h2.addAll(h1);
//		System.out.println(h2); // [10, 1.2, abc, null]

		h2.add(10);
		h2.add(200);

//		h2 = (LinkedHashSet) h1.clone();
//		System.out.println(h2);
		
		h2.retainAll(h1);
		System.out.println(h2);// [10]
	}

}
