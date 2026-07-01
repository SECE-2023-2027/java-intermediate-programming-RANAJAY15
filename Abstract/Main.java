package Abstract;

abstract class Appliance {

    // Concrete property
    String brand;

    // Constructor
    Appliance(String brand) {
        this.brand = brand;
    }

    // Concrete method
    void turnOn() {
        System.out.println("Appliance is now powered on.");
    }

    // Abstract method
    abstract void makeWork();
}

// Subclass
class WashingMachine extends Appliance {

    // Constructor
    WashingMachine(String brand) {
        super(brand);
    }

    // Implement abstract method
    @Override
    void makeWork() {
        System.out.println("Washing machine is washing clothes.");
    }
}

public class Main {
    public static void main(String[] args) {

        Appliance app = new WashingMachine("Whirlpool");

        app.turnOn();
        app.makeWork();
    }
}