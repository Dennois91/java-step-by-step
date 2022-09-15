import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scan = new Scanner(System.in);
        int day1, day2, day3, max;
        String output = "Write temp of day";

        System.out.println(output);
        day1 = scan.nextInt();
        System.out.println(output);
        day2 = scan.nextInt();
        max = Math.max(day1, day2);
        System.out.println("Highest reported temperature is " + max);
        System.out.println(output);
        day3 = scan.nextInt();
        max = Math.max(day3, max);
        System.out.println("Highest reported temperature is " + max);


        System.out.println("Hello world!");
    }
}
