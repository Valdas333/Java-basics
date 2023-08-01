public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;

    }
    public void performTask(String task){
        System.out.println("Codey is performing task: " +task);
        batteryLevel -= 10;
    }

    public int showBatteryCharge(){
    return batteryLevel;
    }

    public String toString(){
        return "Hello, people!I am a droid whose name is Codey";
    }

    public static void main(String args[]){
        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid);
        System.out.println(myDroid.batteryLevel);
        myDroid.performTask("solve mystery");
        System.out.println(myDroid.showBatteryCharge());
        }
}
