package _231221.interfaceModel;

public class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("텔레비전 turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("텔레비전 turnOff");

    }
}
