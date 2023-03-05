package task_1;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void fly() {
        System.out.printf("%s can't fly!\n", getType());
    }
}
