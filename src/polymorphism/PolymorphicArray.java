package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {
        /*
        "Alex" , "John", "Max"
        1, 2, 3, 4, 5
        'X', '$'
         */
        Object[] elements = {5, 10.5, '*', "Alex", true, new Dog(), new Scanner(System.in), new ArrayList<>(), new String[5]};

        for (Object element : elements) {
            System.out.println(element.getClass().getSimpleName());
                                                                /*
                                                                Integer
                                                                Double
                                                                Character
                                                                String
                                                                Boolean
                                                                Dog
                                                                Scanner
                                                                ArrayList
                                                                String[]
                                                                 */


        }
    }
}
