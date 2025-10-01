package CollectionsAll;

import java.util.PriorityQueue;

public class PriorityAll {

	public static void main(String[] args) {
//		Fact();
//		Sum();
//		FrequencyCount();
//		PassengerChecked();
		MergeTwoQueue();
	}

	public static void Fact() {

		int num = 5;

		PriorityQueue<Integer> p = new PriorityQueue<Integer>();

		for (int i = 1; i <= 5; i++) {
			p.add(i);
		}
		System.out.println("All : " + p);

		int fact = 1;
		for (int i : p) {
			fact *= i;
		}

		System.out.println("Fact of " + num + " is: " + fact);
	}

	public static void Sum() {

		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		int num = 1234, rem, sum = 0;

		while (num > 0) {
			rem = num % 10;

			p.add(rem);
			num /= 10;
		}

		System.out.println(p);

		for (int i : p) {

			sum += i;
		}
		System.out.println("Sum of All Element is: " + sum);

	}

	public static void FrequencyCount() {

		PriorityQueue<Integer> p = new PriorityQueue<Integer>();

		int a[] = { 1, 2, 3, 4, 5, 2, 3, 3, 5, 3, 5, 3 };
		int c = 0;

		for (int i : a) {
			p.add(i);
		}
		System.out.println(p);

//		for (int i = 0; i < a.length; i++) {
//			p.add(a[i]);
//		}
//		System.out.println(p);

		for (int i : a) {
			if (i == 3) {
				c++;
			}
		}
		System.out.println("Frequency of 3 is: " + c);
	}

	public static void PassengerChecked() {

		PriorityQueue<String> p = new PriorityQueue<String>();

		String a[] = { "Passenger1", "Passenger2", "Passenger3", "Passenger4", "Passenger5" };

		for (String st : a) {
			p.add(st);
		}
		System.out.println(p);

		if (p.isEmpty()) {

		}
		for (String st : a) {

			System.out.println(st + " Checked!");

		}
//		System.out.println(p); //  here i have use !p.isEmpty coz forEach se array empty hi nhi hota but normal loopin se [] hota hai
		if (!p.isEmpty()) {
			System.out.println("All Passenger are being checked!!");
		}

	}

	public static void MergeTwoQueue() {

		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();

		p1.add(10);
		p1.add(20);
		p1.add(30);
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		p2.add(40);
		p2.add(50);
		PriorityQueue<Integer> p3 = new PriorityQueue<Integer>();

		System.out.println(p1);
		System.out.println(p2);
		for (int i : p1) {
			p2.add(i);
		}

		for (int i : p2) {
			p3.add(i);
		}

		System.out.println(p3);

	}

}
