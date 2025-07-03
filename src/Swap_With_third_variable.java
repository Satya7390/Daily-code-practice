
import java.util.*;

public class Swap_With_third_variable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your two numbers to swap !! ");
		
		System.out.print("a = : ");
		int a = sc.nextInt(); // 77
		
		System.out.print("b = : ");
		int b = sc.nextInt(); // 88
		
		System.out.println("Before Swapping values is : "+"a = "+a+" b = "+b);
		
//		int temp; // 
//		temp = a; // temp = 77
//		a = b;    // a = 88
//		b = temp; // b = 77
		
		
		// without 3rd variables 1st method
		
//		a = a+b; // a = 165
//		b = a-b; // b = 77
//		a = a-b; // a = 88
		
		
		// without 3rd variables 2nd method
		
		a = a*b; // a = 8*5 = 40
		b = a/b; // b = 40/5 = 8
		a = a/b; // a = 40/8 = 5
		
		System.out.print("Now your updated values is : \n "+"a = "+a+" b = "+b);
		
		
		
	}

}
