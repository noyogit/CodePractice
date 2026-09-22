// 1. ABSTRACT CLASS (The Partial Blueprint)
abstract class Animal {
    String name;

    // Constructor to set common state
    Animal(String name) {
        this.name = name;
    }

    // Abstract method: NO body (forces child classes to define their own sound)
    abstract void makeSound();

    // Regular (concrete) method: Shared logic written ONCE
    void sleep() {
        System.out.println(name + " is sleeping... Zzz");
    }
}

// 2. CHILD CLASS 1 (Fills in the missing details)
class Dog extends Animal {
    Dog(String name) {
        super(name); // Pass name to Animal constructor
    }

    // Must override the abstract method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

// 3. CHILD CLASS 2 (Fills in its own details)
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    // Must override the abstract method
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

// 4. MAIN CLASS
public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal("Generic"); ❌ ERROR: Cannot instantiate an abstract class!

        // Create objects of concrete subclasses using parent reference
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        // Calling abstract method (Executes subclass logic)
        myDog.makeSound(); // Output: Buddy says: Woof! Woof!
        myCat.makeSound(); // Output: Whiskers says: Meow!

        // Calling regular method (Executes shared parent logic)
        myDog.sleep();     // Output: Buddy is sleeping... Zzz
        myCat.sleep();     // Output: Whiskers is sleeping... Zzz
    }
}