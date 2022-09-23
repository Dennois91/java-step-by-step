public class Eagle extends Bird {
    private String name;
    private String color;
    private int age;

    @Override
    public String sound() {
        String soundOfAnimal = "Eagle says: Kraw! kraw! kraw!\n";
        return soundOfAnimal;
    }

    public Eagle() {
    }

    public Eagle(int weight, boolean flying, String name, String color, int age) {
        super(weight, flying);
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "Eagle " +
                "name is " + name + "\n" +
                "Color of bird is " + color + "\n" +
                "Age of bird is " + age + " years";
    }
}
