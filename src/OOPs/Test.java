package OOPs;

class Test1 {

	int a;
	String b, ct;

	
	
	Test1(int a, String b, String ct) { // by constructor

		this.a = a;
		this.b = b;
		this.ct = ct;
	}

	Test1(int a) { // by constructor

		this.a = a;
	}
	
	

	Test1(int a, String b) { // by constructor

		this.a = a;
		this.b = b;

	}

	void display() {
//		get(123, "Satya", "Pune"); // or this.get(123, "Satya", "Pune");

		System.out.print("Id: " + a + " Name: " + b + " City: " + ct);
	}

	void hii() {
		System.out.println("I'm from Hii...");
	}

	void all() {
		hii();
		System.out.println("All Method is called...");
		display();
	}

}

public class Test {

	public static void main(String[] args) {
		Test1 t = new Test1(123, "Satya", "Pune");
//		t.get(123, "Satya", "Pune");
		t.all();
	}

}
