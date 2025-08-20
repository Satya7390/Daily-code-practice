package Package1;

//import Package2.One12; // first way to access one package to another
import Package2.*; // Second way to access one package to another

public class One {

	public static void main(String[] args) {

		System.out.println("Hello Develeopers!!");

		One12 t = new One12();
		int a = t.add1(2, 4);
		int b = t.mul1(2, 10);
		System.out.println("Add: " + a);
		System.out.println("Mul: " + b);
//		Package2.One12 tt = new Package2.One12(); // Third way ( Fully Qualified name ) to access one package to another
		t.get();

	}

}
