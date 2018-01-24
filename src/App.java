import Matma.Matma;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert two integers: ");

        int p = sc.nextInt();
        int w = sc.nextInt();

        System.out.println(Matma.pow(p, w));
    }
}
