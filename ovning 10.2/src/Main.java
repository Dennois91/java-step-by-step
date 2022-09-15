import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

        int highestNumber = 0;
        while (true) {

            String input = bufferedReader.readLine();
            if (input == null) {
                break;
            }
            int inputAsInt = Integer.parseInt(input);
            if (inputAsInt > highestNumber) {
                highestNumber = inputAsInt;

            }
        }
        System.out.println("programmet avbröts. Högsta numret är " + highestNumber);
    }
}

