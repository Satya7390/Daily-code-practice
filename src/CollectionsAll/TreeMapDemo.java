package CollectionsAll;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(20, "Twenty");
		tm.put(10, "Ten");
		tm.put(30, "Thirty");
		tm.put(10, "Ten");
		tm.put(50, "Fifty");
		System.out.println(tm);

		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.headMap(60));
		System.out.println(tm.tailMap(11));
		System.out.println("SubMap: " + tm.subMap(10, 30));

		System.out.println("\n=========================");
		System.out.println("Lower Key: " + tm.lowerKey(50)); // The privious smaller key than key
		System.out.println("Flooer Key: " + tm.floorKey(11)); // The same key if exists, otherwise the nearest smaller
																// key
		System.out.println("Ceiling Key: " + tm.ceilingKey(20)); // The same key if exists, otherwise the nearest bigger
																	// key
		System.out.println("Higher Key: " + tm.higherKey(30));// the next bigger key than given key
		System.out.println("Poll First Entry: " + tm.pollFirstEntry());// removes + gives the lowest entry (smaller key
																		// & its value)
		System.out.println("Poll First Entry: " + tm.pollLastEntry());// removes + gives the largest entry (largest key &
																		// its value)
		System.out.println("Descending Key Set: "+tm.descendingKeySet()); // return key in reverse order
		System.out.println("Descending Map: "+tm.descendingMap());// return the whole key in reverse key order..
		System.out.println("Navigate: "+tm.navigableKeySet());// return a navigateset view of keys

	}

}
