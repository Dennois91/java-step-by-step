import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userInput = readText();
        String reversedInput = reverseText(userInput);
        System.out.println(reversedInput);
    }

    public static String readText() {
        System.out.println("Skriv in en text");
        Scanner scan = new Scanner(System.in);
        String input;
        input = scan.nextLine();
        return input;
    }

    public static String reverseText(String input) {
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        input = input1.toString();
        return input;
    }
}
