package OOPs;

class Aa2 {
	Aa2() {
		System.out.println("I'm From A");
	}
}

class Bb2 extends Aa2 {
	Bb2() {
		System.out.println("I'm From B");
	}
}

class Cc2 extends Aa2 {
	Cc2() {
		System.out.println("I'm From C");
	}
}

class Dd2 extends Bb2 {
	Dd2() {
		System.out.println("I'm From C");
	}
}

//class Dd2 extends Cc2 {
//	Dd2() {
//		System.out.println("I'm From D");
//	}
//}

public class Hybrid {

	public static void main(String[] args) {
		Dd2 t = new Dd2();
	}

}
