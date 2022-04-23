package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PolymorphicCollections {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("\n-------Cat Object-------\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");

        System.out.println("\n-------Dog Object-------\n");
        dog1.eat(); // dog eats
        dog1.sleep(); // dog sleep
        dog1.eat("meat");

        System.out.println("\n-------Anima Object-------\n");
        Animal animal1 = new Animal();
        animal1.eat(); // animal eats
        animal1.eat("some food"); // animal eats some food
        animal1.sleep(); // animal sleeps

        System.out.println("\n-------Cat and Dog Objects in Animal Shape-------\n");

        Animal animal2 = new Dog();
        animal2.eat(); // dog eats
        animal2.sleep(); // dog sleeps

        Animal animal3 = new Cat();
        animal3.eat(); // cat eats
        animal3.sleep(); //cat sleeps

        System.out.println("\n--------Array collection of animals------\n");

        Animal[] animals = {cat1, dog1, animal1, animal2, animal3};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            /*
            Cat
            Dog
            Animal
            Dog // Dog created in the animal shape
            Cat // Cat created in the animal shape
             */
        }
        System.out.println("\n-------Arraylist collection af animals-------\n");

        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(animals));
        //or YOU CAN ADD OBJECT THIS WAY
//        animalList.add(dog1);
//        animalList.add(cat1);
//        animalList.add(animal1);
//        animalList.add(animal2);
//        animalList.add(animal3);
//        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat); Another way to execute

        for (Animal animal : animalList) {
            animal.eat();
        }
    }
}
