package Strings;

public class StringBuilderAll {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello Satya");
		sb.append(" WhatsApp");
		System.out.println(sb); // Hello Satya WhatsApp

//		sb.insert(6, "Hii");
		sb.delete(1, 3);
		System.out.println(sb);
		sb.replace(1, 3, "Hii"); // Hlo Satya WhatsApp
		System.out.println(sb); // HHii Satya WhatsApp
		System.out.println(sb.reverse()); // ppAstahW aytaS iiHH

		StringBuilder sb1 = new StringBuilder("Hello Satya");
		sb1.replace(0, 0, "Hii");
		System.out.println(sb1);
	}

}
