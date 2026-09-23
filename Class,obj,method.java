class Car {                //class
    String brand;
    int speed;

    Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    void displayDetails() {          //method
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
    void accelerate(int inc) {       //method
        speed += inc;
        System.out.println(brand + "Accelerating. New speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("Toyota", 60);         //mycar,sportscar is the object
        Car sportscar = new Car("Ferrari", 200);
        mycar.displayDetails();
        sportscar.displayDetails();

        mycar.accelerate(20);
    }
}