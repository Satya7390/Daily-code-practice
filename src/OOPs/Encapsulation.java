package OOPs;

class Employees1 {

	private int empId;
	private String fName;
	private String lName;
	private String Dept;
	private String empType;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		Employees1 e = new Employees1();
		e.setEmpId(24);
		e.getEmpId();
		System.out.println(e.getEmpId());

	}

}
