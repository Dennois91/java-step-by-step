public class Main {
    public static void main(String[] args) {

        double radie = 10.0, volym, area;

        area = 4 * Math.PI * radie * radie;
        volym = 4 * Math.PI * radie * radie * radie / 3;

        System.out.println("Area:" + area + "  Volym:" + volym);
    }
}