public class Device {
    private int battery;

    public Device() {
        this.battery = 100;
    }
    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void Status() {
        System.out.println("current battery is at :" + this.battery);
    }
}
