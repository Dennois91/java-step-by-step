public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Erik Konstapelsson", "Blåkulla", 199020,
                "polis", 30000);

      /*  person.setName("Erik Konstapelsson");
        person.setAdress("Blåkulla");
        person.setIdNumber(1990);
        person.setBefattning("polis");
        person.setLön(100);
        */

        person.increaseSalary(person.getSalary());

        System.out.println(person);

    }
}

/* Övningar
1. Skapa en klass Person som beskriver en person.
Definiera följande egenskaper: namn, adress och personnummer.
Skapa setters och getters.
2. Skapa en subklass till Person som beskriver en anställd.
Spara klassen som Employee.
Subklassen ska ha nya egenskaper: befattning och lön
Skapa metoder som sätter och hämtar de nya egenskaperna.
Skapa en metod som höjer lönen för en anställd med 10%
3. Skapa ett testprogram där du testar allt ovan.*/
