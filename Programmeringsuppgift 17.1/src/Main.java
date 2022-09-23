import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Parrot(5, true, "Petronella", "Red", 8);
        animals[1] = new Eagle(10, true, "Tommas", "Black", 14);

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i].sound());
            }
        }
    }
}
/*

 Parrot parrot1 = new Parrot(5,true, "Petronella", "Red",8);
 Eagle eagle1 = new Eagle(10, true, "Tommas", "Black", 14);
 String[] animalArry = new String[2];

  animalArry[0] = eagle1.toString();
  animalArry[1] = parrot1.toString();

      for (String animal : animalArry) {
            if (animal.contains("Eagle")){
                System.out.println(eagle1.sound());
            }
            if (animal.contains("Parrot")){
                System.out.println(parrot1.sound());
            }
        } */

/*
Utgå ifrån DJUR superclass med metod läte
Skapa mellanliggande klass som Däggdjur, Kräldjur, Fågel Super/subbclass
Deklarera olika Djur Super/subbclass
Deklarera en array med djur, Skriv satser för att gå igenom arrayen och låta alla djur ge ifrån sig läte
 */