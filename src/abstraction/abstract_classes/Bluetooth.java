package abstraction.abstract_classes;

public interface Bluetooth {
    void connectBluetooth();

    //Static method
    static int getYear(){
        return 2022;
    }

    // Default method (non-static method that has body)
    default boolean isConnected(){
        return true;
    }
}
