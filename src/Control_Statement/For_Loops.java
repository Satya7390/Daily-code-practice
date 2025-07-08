package Control_Statement;

public class For_Loops {

	public static void main(String[] args) {
		int i;
//		for (i = 1; i <= 10; i++) {
//			System.out.println("hello = "+ i);
//		}
//		System.out.println(i);
		
		for (i = 10; i >= 1; i--) {
			System.out.println("hello = "+ i);
		}
	}

}

//============Dry runs==========
// i = 0 0<=4 true = hello  with ln i++
// i = 1 1<=4 true = hello with ln i++
// i = 2 2<=4 true = hello with ln i++
// i = 3 3<=4 true = heloo with ln i++
// i = 4 4<=4 true = hello with ln i++
//so on.....
// i = 11 11<=10 false 

//========Outputs=========
//hello
//hello
//hello
//hello
//hello
//so on....
//11


