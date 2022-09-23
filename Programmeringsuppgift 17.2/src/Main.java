public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(1, 1);
        Punkt punkt2 = new Punkt(4, 4);
        Figur[] figurs = new Figur[2];

        Rektangel rektangel = new Rektangel();
        rektangel.setPunkt(punkt2); // X = Height Y = Width of rectangle

        Circle circle = new Circle();
        circle.setPunkt1(punkt1); // Calculates distance between 2 dots
        circle.setPunkt2(punkt2); // Result will be used as radius to get circle area

        figurs[0] = rektangel;
        figurs[1] = circle;
        for (Figur fig : figurs) {
            fig.area();
        }
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