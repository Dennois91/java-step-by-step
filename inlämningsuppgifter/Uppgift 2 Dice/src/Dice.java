import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void createFile() throws IOException {
        Random random = new Random();
        PrintWriter printer = new PrintWriter(new BufferedWriter(new FileWriter("randomNumbers.txt")));
        final int numbersToGenerate = 1000;

        for (int i = 0; i < numbersToGenerate; i++) {
            int randomNummmer = random.nextInt(1, 7);
            printer.println(randomNummmer);

        }
        printer.close();
        System.out.println("You printed 1000 random numbers to the file randomNumbers.txt");
    }

    public static int[] createArray() throws FileNotFoundException {

        Scanner scanFile = new Scanner(new File("randomNumbers.txt"));
        int[] array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanFile.nextInt();
        }
        System.out.println("Numbers has been stored in array randomNumbers");
        return array;
    }

    public static int[] analyseArray(int[] randomArray) {
        Arrays.sort(randomArray);
        int[] frequencyArray = new int[randomArray.length];
        int counted = -1;
        for (int i = 0; i < randomArray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < randomArray.length; j++) {
                if (randomArray[i] == randomArray[j]) {
                    count++;
                    frequencyArray[j] = counted;
                }
            }
            if (frequencyArray[i] != counted) {
                frequencyArray[i] = count;
            }
        }
        return frequencyArray;
    }
}
