package OOPs;

// single + hierarchical == hybrid (two or combo of inheritance)

class Aa2 {
	int a = 10;
	Aa2() {
		System.out.println("I'm From A");
	}
}

class Bb2 extends Aa2 {
	int a = 100;
	Bb2() {
		System.out.println("I'm From B "+ super.a);
	}
}

class Cc2 extends Bb2 {
	Cc2() {
		System.out.println("I'm From C");
	}
}

class Dd2 extends Bb2 {
	Dd2() {
		System.out.println("I'm From D");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		Dd2 t = new Dd2();
		Cc2 t2 = new Cc2();
	}

}
