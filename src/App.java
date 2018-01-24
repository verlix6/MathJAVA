import Matma.Matma;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int value;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert integer number: ");
        value = sc.nextInt();

        System.out.println("Absolute value of: " + value + " is: " + Matma.abs(value));

        System.out.println("Insert floating point number: ");
        float value2;
        value2 = sc.nextFloat();

        System.out.println("Absolute value of: " + value2 + " is: " + Matma.abs(value2));
    }
}
