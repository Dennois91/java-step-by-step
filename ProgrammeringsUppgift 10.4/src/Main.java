import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.print("Name of file to read? ");
        String fileToRead = input.readLine();
        System.out.print("Words to look for? ");
        String wordsToFind = input.readLine();
        System.out.print("Name of file to create? ");
        String fileToCreate = input.readLine();

        var scanFile = new Scanner(new File(fileToRead));
        var printToFile = new PrintWriter(new BufferedWriter(new FileWriter(fileToCreate, true)));

        while (scanFile.hasNext()) {
            String line = scanFile.nextLine();
            if (line.contains(wordsToFind)) {
                printToFile.println(line);
            }
        }
        printToFile.close();
        scanFile.close();
    }
}
