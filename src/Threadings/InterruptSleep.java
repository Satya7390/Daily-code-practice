package Threadings;

class Test2 extends Thread {

	public void run() {

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().isInterrupted());// to check that given thread is interruped
																			// or not
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			System.err.println("Exception is occured...!!");
		}
	}
}

public class InterruptSleep {

	public static void main(String[] args) {

		Test2 t1 = new Test2();
		t1.start();
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
		t2.start();
		t2.interrupt();
		t3.start();
		t3.interrupt();

	}

}
