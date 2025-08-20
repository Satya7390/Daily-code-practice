package OOPs;

class Agr1 {
	void Agr1() {
		System.out.println("A");
	}
}

class Agr2 {

	Agr1 tt = new Agr1();

	void Agr2() {

		System.out.println("B");
	}
}

public class Aggregation {

	public static void main(String[] args) {

		Agr2 t = new Agr2();
		t.tt.Agr1();
		t.Agr2();
	}

}
