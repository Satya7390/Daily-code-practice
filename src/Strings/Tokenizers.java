package Strings;

import java.util.StringTokenizer;

public class Tokenizers {

	public static void main(String[] args) {
                                                 // String              //Delimeter
		StringTokenizer st = new StringTokenizer("Hello there_Am_here", "_");

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}
	}

}
