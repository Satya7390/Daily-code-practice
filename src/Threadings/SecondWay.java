package Threadings;

//** Thread = > start
// runnable => run
// thread implements runnable
// thread => start, run
// runnable => run

class Testt1 implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}

public class SecondWay {

	public static void main(String[] args) {

		Testt1 t = new Testt1();

		Thread t2 = new Thread(t);
		t2.start();

	}

}
