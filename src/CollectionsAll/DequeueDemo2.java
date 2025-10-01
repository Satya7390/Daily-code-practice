package CollectionsAll;

import java.util.ArrayDeque;

public class DequeueDemo2 {

	public static void main(String[] args) {

		ArrayDeque<Integer> a = new ArrayDeque<Integer>();

		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		System.out.println(a); // [2, 3, 4, 5]
		a.addFirst(1);
		a.addLast(6);
		System.out.println(a); // [1, 2, 3, 4, 5, 6]
		System.out.println("Peek First: " + a.peekFirst()); // 1
		System.out.println("Peek Last: " + a.peekLast()); // 6
		System.out.println("Poll First: " + a.pollFirst());
		System.out.println("Poll Last: " + a.pollLast());
		System.out.println(a); // [2, 3, 4, 5]
		System.out.println(a.getFirst()); // 2
		System.out.println(a.getLast()); // 5
	}
}
