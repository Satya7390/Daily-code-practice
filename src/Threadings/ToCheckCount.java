package Threadings;

import java.util.Iterator;

class Count extends Thread {

	public void run() {
		for (int i = 0; i <= 3; i++) {
			// use to that how many active threads are in working
			System.out.println(Thread.currentThread().activeCount());

		}

	}
}

public class ToCheckCount {

	public static void main(String[] args) {

		Count t = new Count();
		t.start();
		Count t2 = new Count();
		t2.start();
		Count t3 = new Count();
		t3.start();

	}

}
