public class Punkt {
    private int x;
    private int y;

    public Punkt() {
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}


/*
Deklarera en egen klass som heter Punkt (x, y).
Deklarera en abstrakt klass som heter Figur. Figur ska innehålla en startpunkt.
Klassen Figur ska innehålla en abstrakt metod med namnet area.

Deklarera sedan ett antall subklasser till Figur. Cirkel, Triangel och Rektangel.
SKapa en override av metoden area i varge subklass.

Deklarera en Figur[] med alla figurer och beräkna arean för varje figur.
 */