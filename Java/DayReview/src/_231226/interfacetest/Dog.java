package _231226.interfacetest;

public class Dog extends Animal{
    Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = hours * speed * 0.5;
    }
}
