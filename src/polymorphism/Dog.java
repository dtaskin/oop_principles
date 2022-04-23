package polymorphism;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog barks");
    }

    //Override Animal class eat and sleep methods


    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    public void sleep(int hour){
        System.out.println("Dog sleeps " + hour + " hours");
    }
}