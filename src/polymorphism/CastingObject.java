package polymorphism;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // no casting

        /*
        Up-casting
         - putting smaller data into bigger - widening
         - it happens implicitly
         */
        Animal animal1 = new Cat(); // up-casting Cat in the shape of Animal
        Object object1 = new Cat(); // up-casting Cat in the shape of Object
        List<Animal> animals = new ArrayList<>(); // up-casting Arraylist in the shape of List

        /*
        Down-Casting
        - putting bigger into smaller
        -happens explicitly
        BUT: There could be data loss with primitives
        There can be Exception thrown with object done improperly
         */
        /*
        Dog dog1 =(Dog) new Animal(); // cast exception
        System.out.println(dog1); // location

        immediate use of down casting is not possible, and you will get ClassCastException with that
        DO NOT TRY THIS WAY
         */

        Animal a1 = new Dog(); // This is a dog in the shape of animal up - casting
        Dog dog1 = (Dog) a1; // Down - casting Dog to animal

        a1.eat(); // Dog eats
        dog1.eat(); // Dog eats

    }
}
