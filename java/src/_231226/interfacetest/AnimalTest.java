package _231226.interfacetest;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog(8);
        Chicken chicken = new Chicken(3);
        //cheatableChicken은 Cheatable 타입으로 선언되었지만 Chicken객체를 할당해서 casting의 가능성을 열어두었다.
        Cheatable cheatableChicken = new Chicken(5);

        if(cheatableChicken instanceof Cheatable){
            cheatableChicken.fly(); //fly메서드는 Cheatable에 정의되었기 때문에 casting없이 사용 가능하다.
        }

        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + "시간 후");
            System.out.println("개의 이동거리 = " + dog.getDistance());
            System.out.println("닭의 이동거리 = " + chicken.getDistance());
            System.out.println("날으는 닭의 이동거리 = " + ((Chicken)cheatableChicken).getDistance()); //Chicken 타입으로 casting
        }
    }
}
