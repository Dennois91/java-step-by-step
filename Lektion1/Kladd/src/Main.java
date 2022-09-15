import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var person = new Person();
        var konto = new Konto();

        person.name = "Erik";
        person.age = 22;
        person.owner = konto;

        person.owner.saldo = 400;
        person.owner.moms = 30;

        System.out.println(person);
    }


    static double sum(double[] input) {
        return input[0] + input[1] + input[2];
    }

    static double kvadSum(double[] input) {
        return Math.pow(input[0], 2) + Math.pow(input[1], 2) + Math.pow(input[2], 2);

    }

    static void arraycopy(double[] original, int copyFromArr_1_Index,
                          double[] copy, int copyFromArr_2_Index, int elementsToCopy) {
        int i, j, k;

        if (original != copy)
            for (i = 0, j = copyFromArr_1_Index, k = copyFromArr_2_Index; i < elementsToCopy; i++, j++, k++)
                copy[k] = original[j];

        else {

            double[] temp = new double[elementsToCopy];
            for (i = 0, j = copyFromArr_1_Index; i < elementsToCopy; i++, j++)
                temp[i] = original[j];
            for (i = 0, k = copyFromArr_2_Index; i < elementsToCopy; i++, k++)
                copy[k] = temp[i];
        }
    }


    static boolean isSorted(double[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] > lista[i + 1]) {
                return false;
            }
        }
        return true;
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

