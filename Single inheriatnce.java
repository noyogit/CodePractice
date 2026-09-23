class Phone {
    String brand;

    Phone(String brand){
        this.brand=brand;
    }

    void makeCall(String phoneno) {
        System.out.println( brand + " is calling " + phoneno + "...");
    }

    void poweroff() {
        System.out.println(brand + " is switching off ...Zzzz");
    }
}

class SmartPhone extends Phone {
    int camerapix;

    SmartPhone(String brand,int camerapix) {
        this.camerapix= camerapix;
        super(brand);
    }
    void takepic() {
        System.out.println(barnd + " is taking pix with " + camerapix + " of camera");
    }
}

public class MAIN {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung", 108);

        myPhone.makeCall("9876543210");
        myPhone.takepic();
        myPhone.poweroff();
    }
}