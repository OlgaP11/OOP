package task_1;

public class Fish extends Animal{

    public Fish(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("---");
    }

    @Override
    public void go() {
        System.out.printf("%s can't go!\n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s can't fly!", getType());
    }
}
