import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String input;
        String tal1, tal2;
        int operator;
        double result;
        boolean loop = true;

        while (loop) {

            input = JOptionPane.showInputDialog("I am a calculator.\nEnter numbers in format 2+2   2-2   2/2   2*2");

            if (input.length() >= 3) {

                if (input.contains("+")) {

                    operator = input.indexOf('+');
                    tal1 = input.substring(0, operator);
                    tal2 = input.substring(operator + 1);


                    if (tal2.length() == 0 || (tal2.contains("+") || tal2.contains("/") || tal2.contains("*"))) {
                        System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");

                    } else {
                        try {
                            result = (Double.parseDouble(tal1) + (Double.parseDouble(tal2)));
                            System.out.println(result);
                            loop = false;

                        } catch (Exception e) {
                            System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");
                        }
                    }

                    //--------------------------------------------------------------------------------------------------

                } else if (input.contains("-") && !input.contains("/") && !input.contains("*")) {

                    operator = input.lastIndexOf('-');
                    tal1 = input.substring(0, operator);
                    tal2 = input.substring(operator + 1);

                    if (tal2.length() == 0 || (tal2.contains("+") || tal2.contains("-") || tal2.contains("/") || tal2.contains("*"))) {
                        System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");
                    } else {
                        try {
                            result = (Double.parseDouble(tal1) - (Double.parseDouble(tal2)));
                            System.out.println(result);
                            loop = false;

                        } catch (Exception e) {
                            System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");
                        }
                    }

                    //--------------------------------------------------------------------------------------------------

                } else if (input.contains("/")) {
                    operator = input.indexOf('/');
                    tal1 = input.substring(0, operator);
                    tal2 = input.substring(operator + 1);

                    if (tal2.length() == 1 && (tal2.contains("0"))) {
                        System.out.println("You cannot divide by 0");

                    } else {

                        try {
                            result = (Double.parseDouble(tal1) / (Double.parseDouble(tal2)));
                            String resultString = Double.toString(result);

                            if (resultString.length() >= 10) {
                                System.out.println("Result is not a \"Reelt\" number");

                            } else {
                                System.out.println(result);
                                loop = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");
                        }
                    }

                    //--------------------------------------------------------------------------------------------------

                } else if (input.contains("*")) {
                    operator = input.indexOf('*');
                    tal1 = input.substring(0, operator);
                    tal2 = input.substring(operator + 1);

                    try {
                        result = (Double.parseDouble(tal1) * (Double.parseDouble(tal2)));
                        System.out.println(result);
                        loop = false;

                    } catch (Exception e) {
                        System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");
                    }
                } else {
                    System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");
                }
            } else {
                System.out.println("Invalid input. Write with format 2+2 2-2 2/2 2*2 and try again");
            }

        }
    }
}

//Dennis Fridström JAVAD22