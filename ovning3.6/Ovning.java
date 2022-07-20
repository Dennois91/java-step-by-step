import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

class Ovning {
    public static void main(String[] args) {
        
        double costD, vatD, vat, cost;
        try (var scan = new Scanner(System.in)) {
            System.out.println("Enter cost of item:"); 
            cost = scan.nextInt(); //scan.nextLine();
            System.out.println("Enter VAT %");   
            vat = scan.nextInt();
        }

        vatD = vat / 100;
        costD = cost * vatD;
        costD = cost - costD;
       

        System.out.println("Price: " + cost + "\nPrice excl VAT: " + costD);

        
    }
    
}
//Läs in varas pris inkl. Moms. Fråga vad momssatsen är skriv ut pris med och utan moms.