import javax.swing.*;
class Ovning {
    public static void main(String[] args) {

        double price, vat, priceExclVat;
        String inputItem, inputVat;

        inputItem = JOptionPane.showInputDialog("Price of item");
        inputItem = inputItem.replace(",", ".");
        price = Double.parseDouble(inputItem);

        inputVat = JOptionPane.showInputDialog("Enter value of VAT");
        inputVat = inputVat.replace(",", ".");
        vat = Double.parseDouble(inputVat);

        vat = vat / 100;
        vat = price * vat;
        priceExclVat = price - vat;

        System.out.println(vat + " Is the cost of the VAT");
        System.out.println(priceExclVat + " Cost without VAT");

    }
}