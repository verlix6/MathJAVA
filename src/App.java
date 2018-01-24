import Matma.Matma;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int value;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert x: ");
        value = sc.nextInt();

        System.out.println("Absolute value of: " + value + " is: " + Matma.abs(value));
    }
}
