
//Home_Work For 30th June 2025

//area  = (1.73*a*a)/4;

import java.util.*;

public class Area_Of_Equilateral_Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome to the Find  Area Of Equilateral Triangle!!\n");

		System.out.print("Enter your side length : ");
		int a = sc.nextInt();

		float ar = (1.732f * (a * a) / 4);

		System.out.print("Your Area Of Equilateral Triangle is : " + ar);
	}

}
