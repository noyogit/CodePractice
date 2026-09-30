interface Camera {
    default void record() {
        System.out.println("Recording video...");
    }
}
 interface AudioRecord {
    default void record() {
        System.out.println("Recording audio...");
    }
 }

class SmartRecorder implements Camera,AudioRecord {
    @Override                  //Mandatory Override: If both interfaces share the exact same method signature, overriding the method in the implementing class is mandatory.
    public void record() {
        Camera.super.record();          //Syntax Rule: Use InterfaceName.super.methodName() when you want to delegate execution to a specific interface's default implementation.
        AudioRecord.super.record();     //InterfaceName.super.methodName() is mandatory when resolving default method conflicts. The interface name before .super acts as a qualifier so the compiler knows exactly which default behavior you are inheriting.
        System.oiut.println("SmartRecorder: Sync both in one file");
    }
}

public class Main {
    public static void main(String[] args){
        SmartRecorder recorder = new SmartRecorder();
        recorder.record();
    }
}


// A & B (parent class) -> C (child class) -> D & E (grandchild class)

//Why java does not support multiple inheritance?
//-> Java does not support multiple inheritance with classes (a single class extending multiple parent classes) primarily to avoid complexity, ambiguity, and runtime issues.
//-> If two parent classes shared a common top-level ancestor, that base class might end up initialized twice with conflicting values in memory.