package Threadings;

class DaemonTest extends Thread {
	public void run() {
		try {

			for (int i = 0; i <= 2; i++) {
				System.out.println(Thread.currentThread().isDaemon());
			}

		} catch (Exception e) {
			System.out.println("Exception...!!");
		}
	}

}

public class DaemonThread {

	public static void main(String[] args) {
		DaemonTest t = new DaemonTest();
		t.setDaemon(true);
		t.start();
		DaemonTest t2 = new DaemonTest();
//		t2.setDaemon(true);
		t2.start();
//		
//System.out.println("cvbn");
	}

}
