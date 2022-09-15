public class Main {
    public static void main(String[] args) {

        //calculate distance between 2 coordinates
        double distance,
                x1 = -1, x2 = 4,
                y1 = -1, y2 = 3;

        distance = Math.sqrt
                ((x1 - x2) * (x1 - x2)
                        +
                        (y1 - y2) * (y1 - y2));

        System.out.println(distance);
    }
}
