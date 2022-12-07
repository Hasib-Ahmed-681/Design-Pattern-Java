package bridge;

public class main {
    public static void main(String[] args){
        var remoteControl = new RemoteControl(new SonyTv());
        remoteControl.turnOn();
        remoteControl.turnOff();

        var advanceremotecontrol= new AdvancedRemoteControl(new SonyTv());
        advanceremotecontrol.turnOn();
        advanceremotecontrol.setChannel(32);
        advanceremotecontrol.turnOff();

        var remoteControl2 = new RemoteControl(new LGTv());
        remoteControl2.turnOn();
        remoteControl2.turnOff();

        var advanceremotecontrol2= new AdvancedRemoteControl(new LGTv());
        advanceremotecontrol2.turnOn();
        advanceremotecontrol2.setChannel(32);
        advanceremotecontrol2.turnOff();

    }
}
