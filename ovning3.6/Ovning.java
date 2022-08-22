import java.util.Scanner;

class Ovning {
    public static void main(String[] args) {
        
        double costAfterVAT, vatDecimal, vat, cost;
        try (var scan = new Scanner(System.in)) {
            System.out.println("Enter cost of item:"); 
            cost = scan.nextInt(); //scan.nextLine();
            System.out.println("Enter VAT %");   
            vat = scan.nextInt();
        }

        vatDecimal = vat / 100;

        costAfterVAT = cost * vatDecimal;
        costAfterVAT = cost - costAfterVAT;

        System.out.println("Price: " + cost + "\nPrice excl VAT: " + costAfterVAT);
    }
}
