import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner file = new Scanner(new File("data.txt"));

        while (file.hasNext()) {
            int totalTid = 0;
            String user = file.next();

            while (file.hasNextInt()) {
                int tid = file.nextInt();
                totalTid = totalTid + tid;
            }
            System.out.println("User: " + user + " has a total of:" + totalTid + " logged minutes ");
        }
    }
}
