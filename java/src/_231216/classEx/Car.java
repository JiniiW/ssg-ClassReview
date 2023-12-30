package _231216.classEx;

public class Car {
    String company;
    String model;
    String color;
    int maxSpeed;

    Car(String company, String model, String color, int maxSpeed){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car(String model, String compay){
        this(model, compay, "white", 200);
    }
    Car(String model){
        this(model, "kia", "red", 200);
    }
    public void showList(){
        System.out.println(company + ", " + model + ", " + color + ", " + maxSpeed);
    }
}
 class CarMain{
    public static void main(String[] args) {
        Car car = new Car("dk", "ck");
        Car car1 = new Car("kd");

        car.showList();
        car1.showList();
    }
}