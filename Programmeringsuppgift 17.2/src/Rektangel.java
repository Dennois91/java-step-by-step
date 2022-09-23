public class Rektangel extends Figur {
    Punkt punkt = new Punkt();

    public Rektangel() {
    }

    @Override
    void area() {
        int y;
        int x;
        x = punkt.getX();
        y = punkt.getY();
        int a = x * y;
        System.out.println(a + " = Area of rectangle with sides " + x + " and " + y);
    }

    @Override
    void area(int x, int y) {
    }

    public void setPunkt(Punkt punkt) {
        this.punkt = punkt;
    }
}

/*
Choose the length of the rectangle – for example, a = 5 cm .
Decide on the rectangle's width – for example, b = 6 cm .
Multiply these two values: A = 5 cm × 6 cm = 30 cm²
 */