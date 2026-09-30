class Phone {
    String brand;

    Phone(String brand) {
        this.brand=brand;
    }
    void makeCall(String phnno) {
        System.out.println(brand + " is calling " + phnno + "...");
    }
}

class SmartPhone extends Phone {
    int camerapix;
    SmartPhone(String brand, int camerapix) {
        super(brand);
        this.camerapix=camerapix;
    }

    void takephoto() {
        System.out.println(brand + "is taking photo " + camerapix);
    }
}

class AIPhone extends SmartPhone {
    String Aiassist;

    AIPhone(String brand, int camerapix, String Aiassist) {
        super(brand, camerapix);
        this.Aiassist=Aiassist;
    }

    void useAI(String prompt) {
        System.out.println(brand + " is taking pic with " + camerapix + " using Aiassist: " + Aiassist + " with prompt: " + prompt);
    }
}

public class Main {
    public static void main(String[] args) {
        AIPhone myphone= new AIPhone("Nokia", 70 , "Alexa");

        myphone.makeCall("99988800088");
        myphone.takephoto();
        myphone.useAI("click pic");
    }
}

// multilevel -> parent->child->grandchild
