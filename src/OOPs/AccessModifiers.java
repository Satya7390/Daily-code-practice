package OOPs;

public class AccessModifiers {

	public String name = "Satya";
	private String pass = "Satya@5365";
	protected int pin = 321;
	String city = "Pune"; // default

	public void Pub() {
		System.out.println("This is public");
	}

	private void Prv() {
		System.out.println("This is private");
	}

	protected void Pro() {
		System.out.println("This is protected");
	}

	void Def() {
		System.out.println("This is Default");
	}

	public void Demo() {
		System.out.println(name);
		System.out.println(pass);
		System.out.println(pin);
		System.out.println(city);
		Pub();
		Prv();
		Pro();
		Def();
	}

	public static void main(String[] args) {
		AccessModifiers ac = new AccessModifiers();
		ac.Demo();
		

	}

}
