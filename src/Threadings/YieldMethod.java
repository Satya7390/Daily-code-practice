package Threadings;

class YieldTest extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 2; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		} catch (Exception e) {
			System.out.println("Exce...!!");
		}
	}
}

public class YieldMethod {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) {
			// to set change the priority from start to last
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}

		YieldTest t = new YieldTest();
		t.start();
		YieldTest t2 = new YieldTest();
		t2.start();

		// to set change the priority from start to last
//					Thread.yield();

//		Thread-0
//		Thread-0
//		Thread-0
//		Thread-1
//		Thread-1
//		Thread-1
//		main
//		main
//		main

		// output should be look like above but yield not working

	}

}
