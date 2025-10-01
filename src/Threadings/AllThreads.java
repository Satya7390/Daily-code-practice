package Threadings;

class demo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive()); // use to know current thread is in working or not
		System.out.println(Thread.currentThread().getState()); // use to know the state of current thread
		System.out.println(Thread.currentThread().getContextClassLoader()); // to know the classloader of current thread
	}

}

public class AllThreads {

	public static void main(String[] args) {

		demo d = new demo();

		demo d2 = new demo();

		demo d3 = new demo();

		d.start();
		d2.start();
		d3.start();

	}

}
