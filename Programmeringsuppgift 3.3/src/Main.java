import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        var scan = new Scanner(System.in);
        System.out.print("Miles per gallon? ");

        double milesPerGallon = scan.nextDouble();
        double literPerMil = 3.785 / milesPerGallon / 1.609 * 10;
        System.out.println(literPerMil + " L/mil");
    }
}

//1 mile = 1.609 km
//1 gallon = 3.785 liter

