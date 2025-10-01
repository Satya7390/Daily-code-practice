package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileNotFoundExpDemo {

	public static void main(String[] args) {

		try {
			Read_File();
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("File not found");
		}
	}

	public static void Read_File() throws Exception {

		FileReader fr = new FileReader("Test.txt");
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
	}

}
