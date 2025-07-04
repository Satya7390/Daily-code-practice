package Control_Statement;

import java.util.*;

public class All_Conditions {

	public static void main(String[] args) {

		IfChecks();

	}

	// ====================Starting if-else Statement ================================//

	public static void IfChecks() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nHii Welcomes in the voting!!\n");
		System.out.print("Please enter your age : ");

		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("You can go for vote!!");
		} else {
			System.out.print("Sorry you're not eligble for the vote!!\n");
		}

	}
	
	// ====================Closing if-else Statement ================================//
	
	
	

}
