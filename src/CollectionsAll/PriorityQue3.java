package CollectionsAll;

import java.util.PriorityQueue;

public class PriorityQue3 {

	public static void main(String[] args) {

		PriorityQueue<Integer> t = new PriorityQueue<Integer>();

		t.add(23);
		t.add(22);
		t.add(21);
		t.offer(25);
		System.out.println(t);
		t.remove();
		System.out.println(t);
		t.poll();
		System.out.println(t);
		t.clear();
		System.out.println(t.remove());
	}

}
