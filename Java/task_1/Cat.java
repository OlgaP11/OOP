package task_1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color, 4);
    }


    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void fly() {
        System.out.printf("%s can't fly!\n", getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s can't swim!\n", getType());
    }
}


