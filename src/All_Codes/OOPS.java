package All_Codes;

public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pen p1 = new Pen(); // created a pen object called p1
//		p1.setColor("Blue");
//		p1.setTip(5);
//		System.out.println(p1.getColor());
//		System.out.println(p1.tip);
		Bank_Account ac = new Bank_Account();
		ac.setPass("satya34243");
		ac.user = "satya";
		System.out.println("Username: " + ac.user);
		System.out.print("Password: " + ac.getPass());

	}

}

class Bank_Account {
	private String pass;
	String user;

	public void setPass(String pwd) {
		pass = pwd;
	}

	String getPass() {
		return this.pass;
	}

}

class Pen {
	private String color;
	int tip;

	void setColor(String newColor) {
		this.color = newColor;
	}

	String getColor() {
		return this.color;
	}

	void setTip(int newTip) {
		tip = newTip;
	}
}
