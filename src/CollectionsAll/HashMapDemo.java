package CollectionsAll;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put(1, "Satya");
		hm.put(2, "SatyaG");
		hm.put(1, "Satya Gupta");
		hm.put(3, "Satya");
		hm.put(4, "Satya");
		hm.put(11, null);
		hm.put(null, 11);
		hm.put("", "empty");
		hm.put("empty", "");

		System.out.println(hm);

		HashMap hm1 = new HashMap();
		hm1.put('p', 78);
		hm1.put("zzz", 12);
		hm.putAll(hm1);
		System.out.println(hm);
		hm.remove(2);
		System.out.println("After deletion :" + hm);

		System.out.println("ContainsKey: " + hm.containsKey("empty"));
		System.out.println("ContainsValue: " + hm.containsValue("Satya"));
		hm.remove(2, "SatyaG");
		System.out.println("==> " + hm);
		hm.replace('p', "78 Replaced");
		System.out.println("Replaced: " + hm);
		System.out.println("Size: " + hm.size());
		System.out.println("Entries Set: " + hm.entrySet());
		System.out.println("Key Set: " + hm.keySet());

		System.out.println();
		hm.forEach((k, v) -> {
			System.out.println("Key = " + k + " Value = " + v);
		});

		hm.clear();
		System.out.println("Clear = " + hm);
	}

}
