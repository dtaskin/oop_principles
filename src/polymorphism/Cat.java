package polymorphism;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
