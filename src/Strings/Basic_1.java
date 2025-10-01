package Strings;

public class Basic_1 {

	public static void main(String[] args) {

		String str1 = new String("Hii Satya!");
		System.out.println(str1); // Hii Satya!
		str1.concat(" Good Morning");
		System.out.println(str1); // Hii Satya!

		System.out.println("============================");

		System.out.println(str1.concat(" Good Morning")); // Hii Satya! Good Morning

		String str2 = str1.concat(" Good Morning");
		System.out.println(str2); // Hii Satya! Good Morning
		System.out.println(str1); // Hii Satya!

		str1 = str1.concat(" Good Morning");

		System.out.println(str1); // Hii Satya! Good Morning

		String str = "hEllo world";
		String str3 = "Hii";
		String str4 = "Hii";
		String str5 = new String("Hii Satya!");
		String str6 = new String("Hii Satya!");
		String str7 = new String("Hii");
		System.out.println(str3 == str4); // true
		System.out.println(str5 == str6); // false
		System.out.println(str3 == str5); // false
		System.out.println(str3.equals(str7)); // true

		System.out.println("\n\n");
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());

		System.out.println("\n\n");
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));

		System.out.println(str.hashCode());
		System.out.println(str);
		System.out.println("Length: " + str.length());
		System.out.println("toLowerCase: " + str.toLowerCase());
		System.out.println("toUpperCase: " + str.toUpperCase());
		System.out.println(str.contains("e")); // f
		System.out.println(str.charAt(1)); // h
		System.out.println(str5.contains("a"));//t
		System.out.println(str5.contains(str3)); // t
		System.out.println(str3.contains(str5)); // f
		System.out.println(str5.replace("Hii", "Hello"));
		System.out.println(str.substring(2)); // llo world
		System.out.println(str.substring(0,4)); // hEll
		
		String strr = new String("");
		String strr1 = new String(" ");
		String strr2 = new String(" Hello ");
		System.out.println(strr.isBlank()); // t
		System.out.println(strr.isBlank()); // t
		System.out.println(strr.isEmpty()); // t
		System.out.println(strr1.isEmpty()); // f
		System.out.println(strr2.trim());//Hello
		

	}

}
