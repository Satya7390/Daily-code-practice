package OOPs;

class A {
	A(int n) {
		System.out.println("A");
	}
}

class B extends A {
	 B() {
		super(4);
		System.out.println("B");
	}
}

//class C extends B {
//	C() {
//		System.out.println("C");
//	}
//}
public class Inheritances {

	public static void main(String[] args) {

		B b1 = new B();
//		b1.A();
	}

}
