public class Circle extends Figur {
    Punkt punkt1 = new Punkt();
    Punkt punkt2 = new Punkt();

    public double sqrt() {

        int x1 = punkt1.getX();
        int x2 = punkt2.getX();
        int y1 = punkt1.getY();
        int y2 = punkt2.getY();
        double dis;
        dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return dis;
    }

    @Override
    void area() {
        double areaOfCircle;
        areaOfCircle = Math.PI * (sqrt() * sqrt());
        System.out.format("%.3f = Area of circle with radius %.3f",areaOfCircle,sqrt());

    }

    @Override
    void area(int x, int y) {
    }

    public void setPunkt1(Punkt punkt1) {
        this.punkt1 = punkt1;
    }

    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
    }
}
