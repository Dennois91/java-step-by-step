abstract class Figur extends Punkt {

    final private int zero = 0;

    public Figur() {
    }

    abstract void area();

    public int getzero() {
        return zero;
    }

    abstract void area(int x, int y);
}
/*
Deklarera en egen klass som heter Punkt (x, y).
Deklarera en abstrakt klass som heter Figur. Figur ska innehålla en zeropunkt.
Klassen Figur ska innehålla en abstrakt metod med namnet area.

Deklarera sedan ett antall subklasser till Figur. Cirkel, Triangel och Rektangel.
SKapa en override av metoden area i varge subklass.

Deklarera en Figur[] med alla figurer och beräkna arean för varje figur.

 */
