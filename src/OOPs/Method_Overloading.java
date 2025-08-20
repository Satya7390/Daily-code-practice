package OOPs;

class Method {

	void get() {
		System.out.println("Hii World!");
	}

	void get(int n) {
		System.out.println("Hii World2!");
	}
}

public class Method_Overloading {

	public static void main(String[] args) {

		Method t = new Method();
		t.get();
		t.get(4);
	}

}
