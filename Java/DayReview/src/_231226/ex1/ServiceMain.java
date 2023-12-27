package _231226.ex1;

public class ServiceMain {
    public static void main(String[] args) {
        //인터페이스 변수를 선언하고 구현객체 대입 -> 인젝션
        Service service = new ServiceImpl();
        service.defaultMethod();
        System.out.println();
        Service.staticMethod();
    }
}
