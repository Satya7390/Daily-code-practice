package OOPs;

class Test11 {

	Test11() {
		this(6);

		System.out.println("test-1");
	}

	Test11(int a) {
		this(9.0f);
		System.out.println("test-2 " + a);
	}

	Test11(float a) {
		this(2, 6);
		System.out.println("test-3 " + a);
	}

	Test11(int a, int b) {
		this(a, "Satya");
		System.out.println(a + " test-4 " + b);
	}

	Test11(int a, String b) {
		System.out.println(a + " test-5 " + b);
	}

}

public class Test2 {

	public static void main(String[] args) {

		Test11 t1 = new Test11();

	}

}
