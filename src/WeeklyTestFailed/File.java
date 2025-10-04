//ProblemStatement 
//Using Java I/0, write a program to copy data from one .
//txt file to another. To do this, read from a file named 'source.txt' and 
//write into a file named 'destination.txt'.

package WeeklyTestFailed;

import java.io.*;

public class File {
	public static void main(String[] args) {
		myCode();
	}

	public static void myCode() {
		try {
			// Open source file for reading
			FileReader fr = new FileReader("source.txt");
			BufferedReader br = new BufferedReader(fr);

			// Open destination file for writing
			FileWriter fw = new FileWriter("destination.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			String line;
			// Read each line from source.txt and write to destination.txt
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine(); // Preserve line breaks
			}

			// Close resources
			br.close();
			bw.close();

			System.out.println("File copied successfully!");
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
