package CollectionsAll;

import java.util.*;

public class PriorityQue2 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(9);
		p.add(8);
		p.add(7);
		p.add(6);
		p.add(5);
		p.add(4);
		p.add(3);
		p.add(2);
		p.add(1);
//		p.add(null); // Exception occured
		System.out.println(p);
		p.clear();

//		peek() return null if queue is empty
		System.out.println(p.peek()); // 1 // picks the top of the element from queue

//		peek() return exception if queue is empty
		System.out.println(p.element()); // Exception

//		System.out.println(p.poll()); // blank // picks 1 element and remove in 2nd steps
//		System.out.println(p); // [2, 3, 4, 6, 7, 8, 5, 9]

	}

}
