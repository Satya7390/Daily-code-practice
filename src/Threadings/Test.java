package Threadings;

class Test1 extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(2000);
//
//			} catch (Exception e) {
//				System.err.println(e);
//			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class Test {

	public static void main(String[] args) {

		Test1 t = new Test1();
		t.setName("I am first");
//		t.stop();  not working coz this is old method
//		t.suspend();
//		t.resume();
		t.start();
		try {
			t.join();
		} catch (Exception e) {
			System.err.println(e);
		}

		Test1 t2 = new Test1();
		t2.start();
	}

}
