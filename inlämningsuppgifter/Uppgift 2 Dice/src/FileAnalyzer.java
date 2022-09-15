import java.io.*;
public class FileAnalyzer {
    static BufferedReader reader = null;
    public static void charCounter() throws IOException {
        File file = new File("data.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        reader = new BufferedReader(input);

        int charCounter = 0;
        String data;
        while ((data = reader.readLine()) != null){
            charCounter = charCounter+data.length();
        }
        System.out.print(charCounter);
    }
}
 