import javax.swing.*;

class main {

    public static void main(String[] arg) {

        double saldo, interesst, årAttSpara = 0, årSparat = 0, tjänat = 0;

        saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Sätt in pengar:"));
        interesst = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv räntesats med decimal:"));
        årAttSpara = Double.parseDouble(JOptionPane.showInputDialog(null, "Skriv antal år för placering"));

        interesst = interesst / 100;
        interesst = interesst + 1;

        while (årSparat <= årAttSpara) {

            årSparat++;
            tjänat = saldo * interesst - saldo;
            saldo = saldo * interesst;

            System.out.println("år " + årSparat + " nytt saldo: " + saldo + " Tjänad ränta från förra året" + tjänat);
        }
    }
}
