package task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murka", "white");
        Dog dog1 = new Dog("Sharik", "black");
        Duck duck1 = new Duck("Donald", "white");
        Seagull seagull1 = new Seagull("John", "white");
        Fish fish1 = new Fish("Nemo", "Orange");
        Dolphin dolphin1 = new Dolphin("Lily", "grey");

        List <Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        animals.add(duck1);
        animals.add(seagull1);
        animals.add(fish1);
        animals.add(dolphin1);

        for (Animal a: animals) {
            System.out.printf("%s :", a.getType());
            a.fly();
        }

        for (Animal a: animals) {
            System.out.printf("%s :", a.getType());
            a.go();
        }

        for (Animal a: animals) {
            System.out.printf("%s :", a.getType());
            a.swim();
        }

    }
}