// PARENT CLASS
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Parent method to be overridden
    void sound() {
        System.out.println(brand + " makes a generic vehicle noise.");
    }
}

// CHILD CLASS 1
class Bicycle extends Vehicle {
    Bicycle(String brand) {
        super(brand);
    }

    // Overriding the sound() method for Bicycle
    @Override
    void sound() {
        System.out.println(brand + " goes: Ring Ring! 🔔");
    }
}

// CHILD CLASS 2
class Bike extends Vehicle {
    Bike(String brand) {
        super(brand);
    }

    // Overriding the sound() method for Motorbike
    @Override
    void sound() {
        System.out.println(brand + " goes: Vroom Vroom! 🏍️");
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("Generic Transport");
        Bicycle myBicycle = new Bicycle("Hero");
        Bike myBike = new Bike("Yamaha");

        // Calling sound() on each object
        genericVehicle.sound(); // Executing parent method
        myBicycle.sound();      // Executing Bicycle's overridden method
        myBike.sound();         // Executing Bike's overridden method
    }
}

// //Generic Transport makes a generic vehicle noise.
// Hero goes: Ring Ring! 🔔
// Yamaha goes: Vroom Vroom! 🏍️

//Method overriding occurs when a child class provides its own specific implementation of a method that is already defined in its parent class.