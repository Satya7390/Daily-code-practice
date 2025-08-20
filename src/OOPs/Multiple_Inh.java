package OOPs;

class Am {// parent class 1
	Am() {
		System.out.print("Am1");
	}

}

class Am2 {// parent class 2
	Am2() {
		System.out.print("Am2");
	}

}

class Am3 extends Am2 {
	Am3() {
		System.out.print("Am3");
	}

}

public class Multiple_Inh {

	public static void main(String[] args) {

		Am3 t = new Am3();
	}
}