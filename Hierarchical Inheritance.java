class Vehical {
    String brand;
    int speed;

    Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void Speedup(int increment) {
        speed += increment;
    }

    void Slowdown(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }    
        System.out.println(brand + " slow down to " + speed + " km/hr");
    }
}

class Bicycle extends Vehicle {
    int gear;

    Bicycle(String brand, int gear) {
        super(brand);
        this.gear = gear;
    }

    void changeGear(int newGear) {
        gear = newGear;
        System.out.println(brand + " is on gear " + gear);
    }
}

class Bike extends Vehicle {
    int fuelLevel;

    Bike(String brand, int fuelLevel) {
        super(brand);
        this.fuelLevel = fuelLevel;
    }
    void startEngine() {
        if(fuelLevel > 0) {
            System.out.println(brand + " engine started");
        } else {
            System.out.println(brand + " needs fuel");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle mybicycle = new Bicycle("Hero");

        mybicycle.startEngine();
        mybicycle.Speedup(10);
        mybicycle.changeGear(2);
        mybicycle.Slowdown(5);
    }
}



// ---> If we dont use method overriding in inheritance then

// class Vehicle {
//     void sound() {
//         System.out.println("Makes a noise");
//     }
// }

// class Bicycle extends Vehicle {} // Inherits sound() directly
// class Bike extends Vehicle {}    // Inherits sound() directly

// // Execution:
// Bicycle b1 = new Bicycle();
// Bike b2 = new Bike();

// b1.sound(); // Output: Makes a noise
// b2.sound(); // Output: Makes a noise

//---> Using Overriding
// class Vehicle {
//     void sound() {
//         System.out.println("Makes a noise");
//     }
// }

// class Bicycle extends Vehicle {
//     @Override
//     void sound() {
//         System.out.println("Ring Ring!"); // Replaces parent implementation
//     }
// }

// class Bike extends Vehicle {
//     @Override
//     void sound() {
//         System.out.println("Vroom Vroom!"); // Replaces parent implementation
//     }
// }

// // Execution:
// Bicycle b1 = new Bicycle();
// Bike b2 = new Bike();

// b1.sound(); // Output: Ring Ring!
// b2.sound(); // Output: Vroom Vroom!