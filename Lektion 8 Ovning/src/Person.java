class Person {
    private String name;
    private String adress;
    private int idNumber;

    public Person(String name, String adress, int idNumber) {
        this.name = name;
        this.adress = adress;
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", idNumber=" + idNumber +
                '}';
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
