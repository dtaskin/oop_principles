package inheritance;

public class Tester extends Person{
    public Tester(){

    }

    public Tester(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void codes(){
        System.out.println("Tester codes");
    }
}
