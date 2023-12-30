package _231226.ex3;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Bus busD = new Bus();
        Taxi taxiD = new Taxi();

        //promotion -> 오버라이딩 메서드 호출 -> 다형성 구현
        driver.drive(busD);
        driver.drive(taxiD);

        System.out.println("객체 구현 방법");
        //1. 객체 직접 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        bus.run();
        taxi.run();

        //2. 인터페이스를 사용한 변수 대입
        Vehicle vehicle;
        vehicle = new Bus();
        vehicle.run();
        vehicle = new Taxi();
        vehicle.run();

        //3. 인터페이스를 사용한 객체 생성 및 변수 대입
        Vehicle busV = new Bus();
        Vehicle taxiV = new Taxi();
        busV.run();
        taxiV.run();
    }
}
