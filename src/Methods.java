import java.util.*;

class Test { 
//	int a, b;

//	public void add(int a, int b) {
//
//		int sum = a + b;
//		System.out.println(sum);
//	}

	static void add(int a, int b) { // userdefined

		int sum = a + b;
		System.out.println(sum);
	}

	static void Message() { // userdefined

		System.out.println("Hii");
	}
}

public class Methods { 

	static void msg() { // predefined method
		System.out.println("Message me");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
//		Test t1 = new Test();
		int a = sc.nextInt();
		int b = sc.nextInt();
//		t1.add(t1.a, t1.b);
//		t1.a = sc.nextInt();
//		t1.b = sc.nextInt();
//		t1.add(t1.a, t1.b);

		Test.add(a, b);
		Test.Message();
		msg();
	}

}
