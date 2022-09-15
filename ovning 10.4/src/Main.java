import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        var input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Name of file to read");
        String fileToRead = input.readLine();
        var inputStream = new BufferedReader(new FileReader(fileToRead));

        System.out.println("Name of file to create");
        String fileToCreate = input.readLine();
        var outputToFile = new PrintWriter(new BufferedWriter(new FileWriter(fileToCreate)));

        while (true) {
            String line1 = inputStream.readLine();

            if (line1 == null) {
                break;
            }
            String line2 = inputStream.readLine();
            int score = Integer.parseInt(line2);
            if (score >= 50) {
                outputToFile.println(line1 + " Has 50 points or more.");
            }
        }
        outputToFile.close();
    }
}


// Scanner file = new Scanner(new File("data.txt"));