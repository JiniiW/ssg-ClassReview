package _231221.interfaceModel;

public class Main {
    public static void main(String[] args) {
        //인터페이스 객체 생성
        RemoteControl r1 = new Audio();
        RemoteControl r2 = new Television();

        r1.turnOn();
        r1.turnOff();

        r2.turnOn();
        r2.turnOff();
    }
}