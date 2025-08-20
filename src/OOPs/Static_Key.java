package OOPs;

class StaticTest {

	static { // work before main method
		System.out.println("Static");
	}

	static void get() { // works after main method
		System.out.println("Get");
	}

}

public class Static_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest.get();

	}

}
