package CollectionsAll;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();

		t.add(10);
		t.add(1);
		t.add(20);
		t.add(1);
//		t.add(null); not allowed
//		t.add(1.2);  not allowed
//		t.add("abc"); not allowed
//		t.add('abc'); not allowed
//		t.remove(1);
		System.out.println(t); // [1, 10, 20]
		System.out.println(t.size()); // 3
		System.out.println(t.contains(1)); // true

//		t.clear();
//		System.out.println(t.isEmpty()); //  true coz we used clear already

		TreeSet t1 = new TreeSet(t);

//		t1.addAll(t);
//		System.out.println(t1); // [1, 10, 20]
		
		// return >=
		// nearest > than given

		int ele = 3;
		System.out.println(t1.ceiling(ele)); //  10 (it returns nearest higher value
		
		// return <=
		// should be nearest
		
		System.out.println(t1.floor(ele)); //  1
		
		int ele2 = 1;
		
		System.out.println(t1.higher(ele)); // 10 (It returns nearest greater value also it is old method of ceiling)
		
		System.out.println(t1.lower(ele2)); // null (It returns nearest less value also it is old method of floor)
		System.out.println(t1.lower(ele)); // 1 

	}

}
