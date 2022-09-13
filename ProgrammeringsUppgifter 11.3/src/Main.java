import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        double[] lista = {1, 5, 2, 6, 3, 6, 3, 7, 2, 9, 1};
        boolean verify = isSorted(lista);
        System.out.println(verify);
        System.out.println(Arrays.toString(lista));

        Arrays.sort(lista);

        verify = isSorted(lista);
        System.out.println(verify);
        System.out.println(Arrays.toString(lista));
    }

    static boolean isSorted(double[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            if (lista[i] > lista[i + 1]) {
                return false;
            }
        }
        return true;
    }
}