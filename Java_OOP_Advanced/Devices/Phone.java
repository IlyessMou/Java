public class Phone extends Device {
    
    public void makeCall() {
        if (getBattery() > 0) {
            System.out.println("You make a call.");
            setBattery(getBattery() - 5);
            checkBatteryStatus();
        } 
    }

    public void playGame() {
        if (getBattery() >= 25) {
            System.out.println("You play a game.");
            setBattery(getBattery() - 20);
            checkBatteryStatus();
        } else {
            System.out.println("Battery too low!!! 🚫🪫");
        }
    }
    public void charge() {
        System.out.println("Charging👌");
        setBattery(getBattery()+50); 
        if (getBattery()>100){
            setBattery(100);
        } 
        Status();  
    }

    private void checkBatteryStatus() {
        if (getBattery() < 10) {
            System.out.println("Battery critical! Please charge soon.");
        }
        Status();
    }
    
}
