public class Punkt {
    private int x;
    private int y;

    public Punkt() {
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void distanceFromOrigo() {
        double fromOrigo;
        fromOrigo = Math.sqrt((x * x) + (y * y));
        System.out.printf("Distance from origin is %.3f", fromOrigo);
    }

    public void moveX(int x) {
        if (x > 0) {
            this.x = this.x + x;
            System.out.println("you moved x " + (this.x - x) + " to x " + this.x);
        } else if (x < 0) {
            this.x = this.x + x;
            System.out.println("you moved x " + (this.x - x) + " to x " + this.x);
        }
    }

    public void moveY(int y) {
        if (y > 0) {
            this.y = this.y + y;
            System.out.println("you moved y " + (this.y - y) + " to y " + this.y);
        } else if (y < 0) {
            this.y = this.y + y;
            System.out.println("you moved y " + (this.y - y) + " to y " + this.y);
        }
    }
}
