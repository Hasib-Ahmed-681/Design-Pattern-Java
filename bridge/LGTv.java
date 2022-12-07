package bridge;

public class LGTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("lg turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("lg turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Lg: Set Channel");
    }
}
