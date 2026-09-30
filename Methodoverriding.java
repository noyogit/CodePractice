class PaymentProcessor {
    void processPayment(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

class CreditCardPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " with 2% fee.");
    }
}

class UPIPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI instant transfer of $" + amount + " via PIN.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent reference pointing to different Child objects in memory
        PaymentProcessor payment1 = new CreditCardPayment();
        PaymentProcessor payment2 = new UPIPayment();

        // Dynamic Method Dispatch determines the execution at runtime
        payment1.processPayment(100.0); // Output: Processing Credit Card payment...
        payment2.processPayment(100.0); // Output: Processing UPI instant transfer...
    }
}