package OOPs;

class over {

	void test() {
		System.out.println("Hello");
	}

}

class over2 extends over { // overriding

	void test() {
		System.out.println("World");
	}

}

public class Mthod_Overriding {

	public static void main(String[] args) {

		over2 t = new over2();
		t.test();

	}

}
