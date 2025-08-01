
package OOPs;

import java.util.*;

public class College {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graduation gd = new Graduation();

//		System.out.print("Id : ");
		gd.setId(23);
//		System.out.print("First Name: ");
//		gd.fname = sc.next();
//		System.out.print("Last Name: ");
//		gd.lname = sc.next();
//		System.out.print("Contact No: ");
//		gd.contact = sc.next();
//		System.out.print("State Name: ");
//		gd.state = sc.next();
//		System.out.print("City Name: ");
//		gd.city = sc.next();
//		System.out.println("\nHere is Details!!\n");
//		System.out.println("Id : " + id);
//		System.out.println("First Name: " + fname);
//		System.out.println("Last Name: " + lname);
//		System.out.println("Contact No: " + contact);
//		System.out.println("State Name: " + state);
//		System.out.println("City Name: " + city);
//		MyCode md = new MyCode();
		System.out.println(MyCode.add(11, 33));
		System.out.println(MyCode.add(11, 33, 11));

	}

}

class MyCode {
	static int add(int a, int b) {
		System.err.println("Coming from message.....");
		return (a + b);
	}

	static int add(int a, int b, int c) {
		System.err.println("Coming from message.....");
		return (a + b + c);
	}
}


class Graduation {

	private int id;
	private String fname, lname, contact, state, city;

//	public void show() {

//	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
