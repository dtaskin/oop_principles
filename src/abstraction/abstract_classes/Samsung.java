package abstraction.abstract_classes;

public class Samsung extends Phone implements Camera,Bluetooth{

    public static final String OS = "Android";
    public Samsung(){

    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }

    @Override
    public void takePhoto() {
        System.out.println("Samsung take photo");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Samsung connects with bluetooth");
    }
}
