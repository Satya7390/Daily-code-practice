package CollectionsAll;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet h = new HashSet();

		h.add(1);
		h.add(2);
		h.add(1);
		h.add(null);
		h.add(null);
		h.add(1.3);
		h.add("Abc");
		h.add(11);
		System.out.println(h);// [null, 1, 2, Abc, 1.3, 11] It follows hascode key value

		HashSet h2 = new HashSet();
		h2.addAll(h); // normal copy
		System.out.println(h2);
//		h2 = (HashSet) h.clone(); // live copy
//
//		System.out.println(h2);

		
	}

}
