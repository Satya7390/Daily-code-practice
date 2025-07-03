
import java.util.Scanner;

public class Students_Marks {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Welcomes on your Resuslt onboards!!");

        int m1, m2, m3, m4, m5;
        System.out.println("Please enter your sujects marks below..");
        System.out.print("Enter your Hindi Marks : ");
        m1 = SC.nextInt();

        System.out.print("Enter your English Marks : ");
        m2 = SC.nextInt();

        System.out.print("Enter your Math Marks : ");
        m3 = SC.nextInt();

        System.out.print("Enter your Physics Marks : ");
        m4 = SC.nextInt();

        System.out.print("Enter your Chemistry Marks : ");
        m5 = SC.nextInt();

        System.out.println("Now your total marks of all Subject is : " + (m1 + m2 + m3 + m4 + m5));

        float avg = ((m1 + m2 + m3 + m4 + m5) / 5);
        System.out.println("Average is : " +avg );

    }
}
