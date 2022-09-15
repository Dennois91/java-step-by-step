import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        System.out.print("time in years ");
        int t = scan.nextInt();

        double lambda = Math.log(2.0) / 5730;  // Skapar halveringskonstanten lambda
        double n0 = 100;  // 100 %
        double rest = n0 * Math.exp(-lambda * t);

        System.out.println("There is " + rest + " % left");
    }
}