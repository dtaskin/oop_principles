package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {
        /*
        Create an object of Samsung called as s1 info it will have is as below
        Samsung
        Black
        64
        700

         */

        Samsung s1 = new Samsung("Samsung", "Black",64,700);
        Nokia n1 = new Nokia("Nokia", "Blue",4,100);
        IPhone i1 = new IPhone("Apple", "Silver", 128,1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*
        Print all objects
        Find and print the most expensive one with the message -> "The most expensive phone is = IPhone"
        Find and print how many phones are convertible -> 2
         */

        for (Phone phone : phones) {
            System.out.println(phone);
        }

        int max = Integer.MIN_VALUE;
        int convertible = 0;
        Phone mostExpensivePhone = null; // this is not string so we can not leave it empty "" IMPORTANT
        for (Phone phone : phones) {
            if(phone.isConvertible()) convertible++;
            if (phone.price > max) mostExpensivePhone = phone;
        }
        System.out.println("How many convertible phones = " + convertible);
        // HOW TO GET THE NAME OF MOST EXPENSIVE PHONE
        System.out.println("The most expensive phone is = " + mostExpensivePhone.getClass().getSimpleName());
        System.out.println("The color of the most expensive phone is = " + mostExpensivePhone.color);

        System.out.println(IPhone.OS); // invoking static instance variables
        System.out.println(Samsung.OS); // invoking static instance variables
        System.out.println(Nokia.OS); // invoking static instance variables

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();
        }



    }
}
