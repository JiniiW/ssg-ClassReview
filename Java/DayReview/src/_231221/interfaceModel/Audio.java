package _231221.interfaceModel;

public class Audio implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("오디오 turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오 turnOff");

    }
}
