package OOPs;

class A {
	A() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
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
	}

}
