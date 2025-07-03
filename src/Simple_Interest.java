
import java.util.*;

public class Simple_Interest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Find your Simple Interest here!!");
		
		System.out.print("Enter Principal Amount : ");
		double p = sc.nextDouble();
		
		System.out.print("Enter Time Duration : ");
		float t = sc.nextFloat();
		
		System.out.print("Now, Enter Rate of Intrest : ");
		float r = sc.nextFloat();
		
		double SI = ((p*t*r)/100);
		
		
		System.out.print("Your Simple Intrest is : "+SI);
		
		
	}

}
