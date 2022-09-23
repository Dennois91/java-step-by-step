class Employee extends Person {
    private String employedAs;
    private double Salary;

    public Employee(String name, String adress, int idNumber, String employedAs, double Salary) {
        super(name, adress, idNumber);
        this.employedAs = employedAs;
        this.Salary = Salary;
    }

    public String getemployedAs() {
        return employedAs;
    }

    public void setemployedAs(String employedAs) {
        this.employedAs = employedAs;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public void increaseSalary(double Salary) {
        double increasedSalary;
        increasedSalary = Salary * 1.02;
        increasedSalary = Math.round(increasedSalary);
        this.Salary = increasedSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee{" +
                "employedAs='" + employedAs + '\'' +
                ", Salary=" + Salary +
                '}';
    }

}

/* ovningar
1. Skapa en klass Person som beskriver en person.
Definiera foljande egenskaper: namn, adress och personnummer.
Skapa setters och getters.
2. Skapa en subklass till Person som beskriver en anställd.
Spara klassen som Employee.
Subklassen ska ha nya egenskaper: employedAs och Salary
Skapa metoder som sätter och hämtar de nya egenskaperna.
Skapa en metod som increaseer Salaryen for en anställd med 10%
3. Skapa ett testprogram där du testar allt ovan. */
