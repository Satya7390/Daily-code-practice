package ExceptionHandling;

public class CustomExceptionClass extends Exception {

	public CustomExceptionClass(String msg) {
		super(msg);
		System.out.println("coming from CustomExceptionClass");
	}
}
