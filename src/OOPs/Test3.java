package OOPs;

class Test4 {
	int a;
	String name;

	Test4(int a, String name) {
		this.a = a;
		this.name = name;

	}

	Test4(Test4 b ) {  // Copy constructor
		this.a = b.a;
		this.name = b.name;
	}

	void show() {
		System.out.println(a+" "+name);
	}

}

public class Test3 {

	public static void main(String[] args) {

		Test4 t4 = new Test4(5, "Satya");
		Test4 copyT = new Test4(t4);
		t4.show();
		copyT.show();

	}

}
