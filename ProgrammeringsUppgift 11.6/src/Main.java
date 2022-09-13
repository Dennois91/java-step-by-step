import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        double[] inputArry = {2.5, 1.5, 3.0};
        System.out.println(getSum(inputArry));
        System.out.println(getKvadSum(inputArry));

    }

    static double getSum(double[] input) {
        return input[0] + input[1] + input[2];
    }

    static double getKvadSum(double[] input) {
        return Math.pow(input[0], 2) + Math.pow(input[1], 2) + Math.pow(input[2], 2);

    }
}