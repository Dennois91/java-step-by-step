import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] randomNumbers;
        String[] frequencyString;

        Dice.createFile();
        randomNumbers = Dice.createArray();
        frequencyString = Dice.analyseArray(randomNumbers);

        System.out.println(Arrays.toString(frequencyString));


        for (int i = 0; i < frequencyString.length; i++) {
            PrintWriter printToFile = new PrintWriter(new BufferedWriter
                    (new FileWriter("numberStatistic.txt", true)));
            printToFile.println(frequencyString[i]);
            printToFile.close();
        }

    }
}