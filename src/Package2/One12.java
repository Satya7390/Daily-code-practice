package Package2;

class Sender1 {
	public int add1(int a, int b) {
		return (a + b);
	}
}

class Sender2 extends Sender1 {
	public int mul1(int a, int b) {
		return (a * b);
	}
}

public class One12 extends Sender2 {

	public void get() {
		System.out.print("Hello Satya!!");
	}

//	public static int add(int a, int b) {
//
//		return (a + b);
//	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
