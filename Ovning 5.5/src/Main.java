import javax.swing.*;
class main {

    public static void main(String[] arg) {

        while (true) {

            String input = JOptionPane.showInputDialog(null, "Height of ball from start");
            if (input == null) {
                break;
            }

            double ballHeight = Double.parseDouble(input);
            double floor = 0.01;
            int bounces = 0;

            while (ballHeight >= floor) {

                ballHeight = ballHeight * 0.70;
                bounces++;
                System.out.println(bounces + "       Height  " + ballHeight);
            }
        }
    }
}
