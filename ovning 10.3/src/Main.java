import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int radNr = 0;
        double radMedKommentar = 0;
        String procentAvRadMedKommentar;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("vVilken fil vill du läsa?");
        String filnamn = input.readLine();
        BufferedReader inputFile = new BufferedReader(new FileReader(filnamn));

        while (true) {
            String rad = inputFile.readLine();

            if (rad == null) {
                double procentAv = radMedKommentar / radNr;

                procentAv = procentAv * 100;
                procentAvRadMedKommentar = Double.toString(procentAv);

                if (procentAvRadMedKommentar.length() <= 4) {
                    procentAvRadMedKommentar = procentAvRadMedKommentar.substring(0, 3);
                    System.out.println(procentAvRadMedKommentar + "% av rederna inehåller kommentarer");
                    break;

                } else if (procentAvRadMedKommentar.length() > 3) {
                    procentAvRadMedKommentar = procentAvRadMedKommentar.substring(0, 5);
                    System.out.println(procentAvRadMedKommentar + "% av rederna inehåller kommentarer");
                    break;
                }
            }
            if (rad.contains("//")) {
                radMedKommentar++;
            }
            radNr++;
            System.out.println(radNr + ": " + rad);
        }
    }
}
