package LeetCode;

public class Hexa_405 {
	
	// pending to understood 

	public static void main(String[] args) {
//		toHex(30);

		System.out.println(toHex(26));

	}

	public static String toHex(int num) {
		if (num == 0)
			return "0";

		// Hex characters
		char[] hexChars = "0123456789abcdef".toCharArray();
		StringBuilder sb = new StringBuilder();

		// Mask for 32-bit two's complement handling
		long n = num & 0xffffffffL;

		while (n > 0) {
			int digit = (int) (n & 15); // last 4 bits
			sb.append(hexChars[digit]);
			n >>= 4; // shift right by 4 bits
		}

		return sb.reverse().toString();
	}

}
