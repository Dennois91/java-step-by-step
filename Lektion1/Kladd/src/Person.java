public class Person {


    Konto owner;
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "owner=" + owner +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
