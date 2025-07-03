
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Welcome to finding your Area of Circumference");
        System.out.print("Enter the Area : ");
        int radius = input.nextInt();
        double area_of_circum = 2 * 3.14 * radius; // 3.14 = pie values
        System.out.println("Your Area of Circumference is : "+area_of_circum);
    }
}

