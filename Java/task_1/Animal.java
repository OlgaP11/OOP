package task_1;

public class Animal {
    private String name;
    private String color;
    private int paws;

    public Animal(String name, String color, int paws) {
        this.name = name;
        this.color = color;
        this.paws = paws;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String name) {
        this(name, null, 0);
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

    public int getPaws() {
        return paws;
    }

    public void speak() {
        System.out.println("Some sound...");
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name: %s, color: %s, paws: %d", this.name, this.color, this.paws);
    }

    public void go() {
        System.out.println("I'm walking");
    }

    public void fly() {
        System.out.println("I'm flying");
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    private void wakeUp() {
        System.out.printf("%s woke up.\n", getType());
    }

    private void findFood() {
        System.out.printf("%s found food.\n", getType());
    }

    private void eat() {
        System.out.printf("%s ate\n", getType());
    }

    public void toPlay() {
        System.out.printf("%s's playing\n", getType());
    }

    public void toSleep() {
        System.out.printf("%s fell asleep\n", getType());
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

}
