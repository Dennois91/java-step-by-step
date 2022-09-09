import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.print("Name of file to read? ");
        String fileName = input.readLine();

        var scanFile = new Scanner(new File(fileName));

        int days = 0;
        int highestTemp = -500;
        int totalTemp = 0;

        while (scanFile.hasNextInt()) {   //Change to hasNextDouble if preferred.
            int temp = scanFile.nextInt();
            highestTemp = Integer.max(temp, highestTemp);
            totalTemp = totalTemp + temp;
            days++;
        }

        System.out.println("Mean temp of month " + totalTemp / days +
                "\nHighest temp of month: " + highestTemp);
    }
}
