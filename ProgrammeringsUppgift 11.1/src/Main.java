import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[1000];
        int counter = 0;
        var scan = new Scanner(System.in);
        System.out.println("Write one number");

        while (scan.hasNextInt()) {
            System.out.println("Write one number");
            intArray[counter] = scan.nextInt();
            counter++;

        }
        for (int i = 0; i < counter; i++) {

            int j;
            for (j = 0; j < i; j++)
                //If value is same prior in the array
                if (intArray[i] == intArray[j])
                    break;
            //If same value was not found previous in array.
            if (i == j)
                System.out.print(intArray[i] + " ");
        }
    }
}