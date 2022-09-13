import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        double[] original = {1, 2, 3, 4, 5, 6, 7};
        double[] copy = new double[5];

        copyArray(original, 0, copy, 0, 4);
        System.out.println(Arrays.toString(copy));

    }

    static void copyArray(double[] original, int copyFromOriginalAtIndex, 
                          double[] copy, int writeToCopyAtIndex, int elementsToCopy) {
        int i, j, k;

        if (original != copy)
            for (i = 0, j = copyFromOriginalAtIndex, k = writeToCopyAtIndex;
                 i < elementsToCopy; i++, j++, k++)
                copy[k] = original[j];

        else {

            double[] temp = new double[elementsToCopy];
            for (i = 0, j = copyFromOriginalAtIndex; i < elementsToCopy; i++, j++)
                temp[i] = original[j];
            for (i = 0, k = writeToCopyAtIndex; i < elementsToCopy; i++, k++)
                copy[k] = temp[i];
        }
    }
}