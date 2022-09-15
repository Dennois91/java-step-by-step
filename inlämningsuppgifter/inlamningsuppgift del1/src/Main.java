import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String weight = "0";
        String height = "0";
        int weightInt = 0;
        int heightInt = 0;
        boolean loop = true;
        while (loop) {
            weight = JOptionPane.showInputDialog("Skriv din vikt i hela kilon").trim();
            try {
                weightInt = Integer.parseInt(weight) * 10000;
            } catch (Exception e) {
                System.out.println("Använd endast siffror!");
                continue;
            }
            height = JOptionPane.showInputDialog("Skriv din längd i cm").trim();
            try {
                heightInt = Integer.parseInt(height) * Integer.parseInt(height);
            } catch (Exception e) {
                System.out.println("Använd endast siffror!");
                continue;
            }
            loop = false;
        }
        int bmi = weightInt / heightInt;
        if (bmi < 18.5) {
            System.out.println("vikt: " + weight + "kg");
            System.out.println("Längd: " + height + "cm");
            System.out.println("BMI: " + bmi);
            System.out.println("Viktklass: Undervikt");
        }
        if (bmi >= 18.5 && bmi < 25) {
            System.out.println("vikt: " + weight + "kg");
            System.out.println("Längd: " + height + "cm");
            System.out.println("BMI: " + bmi);
            System.out.println("Viktklass: Normalvikt");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.println("vikt: " + weight + "kg");
            System.out.println("Längd: " + height + "cm");
            System.out.println("BMI: " + bmi);
            System.out.println("Viktklass: Övervikt");
        }
        if (bmi >= 30 && bmi < 35) {
            System.out.println("vikt: " + weight + "kg");
            System.out.println("Längd: " + height + "cm");
            System.out.println("BMI: " + bmi);
            System.out.println("Viktklass: Fetma klass 1");
        }
        if (bmi >= 35 && bmi < 40) {
            System.out.println("vikt: " + weight + "kg");
            System.out.println("Längd: " + height + "cm");
            System.out.println("BMI: " + bmi);
            System.out.println("Viktklass: Fetma klass 2");
        }
        if (bmi >= 40) {
            System.out.println("vikt: " + weight + "kg");
            System.out.println("Längd: " + height + "cm");
            System.out.println("BMI: " + bmi);
            System.out.println("Viktklass: Fetma klass 3");
        }
    }
}
//Dennis Fridström JAVAD2