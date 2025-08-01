package OOPs;

class Aa1 {
	Aa1() {
		System.out.println("I'm From A");
	}
}

class Bb1 extends Aa1 {
	Bb1() {
		System.out.println("I'm From B");
	}
}

class Cc1 extends Bb1 {
	Cc1() {
		System.out.println("I'm From C");
	}
}

public class Multilevel {

	public static void main(String[] args) {

		Cc1 t = new Cc1();

	}

}
