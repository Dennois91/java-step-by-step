import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userInput = readText();
        int amountOfCharacter = countNumberOfSpecificCharacter(userInput);
        System.out.println(amountOfCharacter);
    }

    public static int countNumberOfSpecificCharacter(String input) {

        int amountOfCharacter = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 't') {
                amountOfCharacter++;
            }
        }
        return amountOfCharacter;
    }

    public static String readText() {
        System.out.println("Skriv in en text");
        Scanner scan = new Scanner(System.in);
        String output;
        output = scan.nextLine();

        return output;
    }
}


