package task_1;

public class Seagull extends Animal {
    public Seagull(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.println("Carr");
    }
}
