package encapsulation;

public class CarTest {
    public static void main(String[] args){
        Car car1 = new Car();

        //Setting info for make
        car1.make = "BMW"; // if you dont set info for make it will return null as default value

        // Getting info for make
        System.out.println(car1.make); //BMW

        //Setting info for year
        car1.setYear(2020); // if you dont set info for year it will be 0 as default value

        //Getting info for year
        System.out.println(car1.getYear()); // 2020

        //Setting and getting info for price with a password
        car1.setPrice(5000,"abcd1234");
        System.out.println(car1.getPrice()); // 5000.0

        System.out.println(car1.getIsConvertible());

    }
}
