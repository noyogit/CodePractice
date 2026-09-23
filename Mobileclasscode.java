class MobilePhone {
    String model;
    int batterylevel;

    MobilePhone(String model, int battery) {
        this.model = model;
        this.batterylevel = batterylevel;
    }

    void useApp(String appName, int batteryuse){
        if (batterylevel >= batteryuse){
            batterylevel -= batteryuse;
            System.out.println("used "+ appName + "on" + model + ". Batterleft: "+ batterylevel);
        }
        else {
            System.out.println(model + " shit down due to low battery");
        }
    }

    void chargePhone() {
        batterylevel = 100;
        System.out.println(model + " fully charge");
    }
}

public class Main {
    public static void main(String[] args) {
        MobilePhone myphone = new MobilePhone("nokia", 45);

        myphone.useApp("Youtube",15);
        myphone.useApp("whatsapp",20);

        myphone.chargePhone();         //here the phn gets fully cahrged again
        myphone.useApp("camera",48);
    }
}