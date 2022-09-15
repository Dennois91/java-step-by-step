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


//Metoden ska beräkna hur många tecken som finns i filen. Med tecken så menas ALLTING
//som finns i filen, oavsett om det är siffror, matematiska operationer, symboler eller
//bokstäver. Varje TECKEN ska räknas