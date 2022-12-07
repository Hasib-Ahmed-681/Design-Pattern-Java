package bridge;

public class SonyTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("sony turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("sony turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: Set Channel");
    }
}
