package _231226.interfacetest;

public class Chicken extends Animal implements Cheatable {
    Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = hours * speed;
    }

    @Override
    public void fly() {
        speed *= 2;
    }
}
