import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int days = 0;
        int highestTemp = -500;
        int totalTemp = 0;
        int linesInFile = 0;

        String fileName = askForFileToRead();
        Scanner firstScanner = firstScanner(fileName);
        Scanner secondScanner = secondScanner(fileName);
        Scanner thirdScanner = thirdScanner(fileName);

        while (firstScanner.hasNextLine()) {
            firstScanner.nextLine();
            linesInFile++;                        //Creates a dynamic value for array
        }
        int[] tempArray = new int[linesInFile];

        for (int i = 0; i < linesInFile; i++) {
            tempArray[i] = secondScanner.nextInt();
        }

        while (thirdScanner.hasNextInt()) {   //Change to hasNextDouble if preferred.
            int temp = thirdScanner.nextInt();
            highestTemp = Integer.max(temp, highestTemp);
            totalTemp = totalTemp + temp;
            days++;
        }
        int mean = totalTemp / days;
        int lineInFile = 1;

        System.out.println("Mean temp of month: " + mean +
                "\nHighest temp of month: " + highestTemp);

        for (int element : tempArray) {

            if (element > mean) {
                System.out.println("Temp on line " + lineInFile + " is: " + element + " and is higher then the " +
                        "mean temp of month");
            }
            lineInFile++;
        }
    }
    public static String askForFileToRead() throws IOException {
        BufferedReader input = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.print("Name of file to read? ");
        return input.readLine();
    }

    public static Scanner firstScanner(String fileName) throws FileNotFoundException {
        return new Scanner(new File(fileName));
    }

    public static Scanner secondScanner(String fileName) throws FileNotFoundException {
        return new Scanner(new File(fileName));
    }

    public static Scanner thirdScanner(String fileName) throws FileNotFoundException {
        return new Scanner(new File(fileName));
    }
}

