package Threadings;

class Priority extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 2; i++) {
				System.out.println(Thread.currentThread().getPriority());
			}
		} catch (Exception e) {
			System.out.println("Exception....!!");
		}
	}
}

public class SetPriority {

	public static void main(String[] args) {
		
		// main by default priority is 5 
		System.out.println("MAIN : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(2);		
		System.out.println("MAIN : "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);		
		System.out.println("MAIN : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);		
		System.out.println("MAIN : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);		
		System.out.println("MAIN : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);		
		System.out.println(Thread.currentThread().getThreadGroup()); // to know the name of current thread group.
		
		Priority t = new Priority();
		t.start();

	}

}
