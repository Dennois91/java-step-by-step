import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] randomNumbers;
        int[] frequency;

        Dice.createFile();
        randomNumbers = Dice.createArray();
        frequency = Dice.analyseArray(randomNumbers);

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(randomNumbers[i] + " was counted: " + frequency[i] + " times");
                PrintWriter printer = new PrintWriter(new BufferedWriter
                        (new FileWriter("numberStatistic.txt", true)));
                printer.println(randomNumbers[i] + " was counted: " + frequency[i] + " times");
                printer.close();
            }
        }
        System.out.print("Number of characters contained in file data.txt is: ");
        FileAnalyzer.charCounter();

    }
}