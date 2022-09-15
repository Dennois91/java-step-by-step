import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.print("Name of file to read? ");
        String fileName = input.readLine();

        var scanFile = new Scanner(new File(fileName));

        var printToFile = new PrintWriter(new BufferedWriter(new FileWriter("bmiOver30.txt", true)));

        while (scanFile.hasNext()) {
            String names = scanFile.nextLine();
            int indexOf = names.indexOf('.');
            String name = names.substring(0, indexOf);

            int age = scanFile.nextInt();
            double height = scanFile.nextDouble();

            height = height / 100;
            double weight = scanFile.nextDouble();
            scanFile.nextLine();

            double BMI = weight / Math.pow(height, 2);
            if (BMI > 30) {

                NumberFormat formatter = new DecimalFormat("0.00");
                String stringBMI = formatter.format(BMI);

                printToFile.println(name + "\nAge: " + age + " years.\n" +
                        "Height: " + height + " Meters.\n" +
                        "Weight: " + weight + " Kilos.\n" +
                        "BMI: " + stringBMI);
            }
        }
        printToFile.close();
    }
}
