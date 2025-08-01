package OOPs;

class Aa {
	Aa() {
		System.out.println("I'm From A");
	}
}

class Bb extends Aa {
	Bb() {
		System.out.println("I'm From B");
	}
}

class Cc extends Aa {
	Cc() {
		System.out.println("I'm From C");
	}
}

public class HierarchicalInherit {

	public static void main(String[] args) {
		Bb t = new Bb();
		Cc t1 = new Cc();

	}

}
