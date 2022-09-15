import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.print("Name of file to read? ");
        String fileName = input.readLine();

        var scanFile = new Scanner(new File(fileName));

        while (scanFile.hasNext()) {
            String lineInEnglish = scanFile.nextLine();
            String lineInSwedish = lineInEnglish.replace("aa", "å");
            lineInSwedish = lineInSwedish.replace("ae", "ä");
            lineInSwedish = lineInSwedish.replace("oe", "ö");

            System.out.println(lineInSwedish);
        }
    }
}
