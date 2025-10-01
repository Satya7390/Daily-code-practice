package CollectionsAll;

import java.util.*;

public class PriorityQue {

	public static void main(String[] args) {

		PriorityQueue<Integer> t = new PriorityQueue<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(5);
		t.add(1);
		// t.add("abc");// can't add coz PriorityQueue is the homogenious not hetro
		System.out.println(t); // [1, 5, 30, 20, 10]

	}

}
