abstract class Bird extends Animal {
    private int weight;
    private boolean flying;  //If bird can fly

    public Bird() {
    }

    public Bird(int weight, boolean flying) {
        this.weight = weight;
        this.flying = flying;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String toString() {
        return "Bird\n" +
                "Weight is " + weight + "kg" +
                "\nFlying is " + flying + "\n";
    }
}
