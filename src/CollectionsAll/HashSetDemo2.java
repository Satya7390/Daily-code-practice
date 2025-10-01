package CollectionsAll;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Integer> h1 = new HashSet<Integer>();

		h1.add(100);
		h1.add(200);
		h1.add(300);
		h1.add(100);
		HashSet<Integer> h2 = new HashSet<Integer>();
		
		h2.add(100);
		h2.add(242);

// common element b/w two set
		h2.retainAll(h1);
		System.out.println(h2);
	}

}
