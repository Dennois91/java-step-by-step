import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        var input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write one name and press ENTER. Write more names. To quit CTRL-D");

        var printToFile = new PrintWriter(new BufferedWriter(new FileWriter("personer.txt", true)));

        while (true) {
            String name = input.readLine();
            if (name == null){
                break;
            }
            printToFile.println(name);
        }
        printToFile.close();
    }
}
