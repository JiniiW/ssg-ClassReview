package _231226.ex1;

public interface Service {
    //default 메서드
    default void defaultMethod(){
        System.out.println("defaultMethod 1 ");
        priavteMethod();
        privateStaticMethod();
    }
    //private 메서드
    private void priavteMethod(){
        System.out.println("priavteMethod 1");
        privateStaticMethod();
    }

    //정적 메서드
    static void staticMethod(){
        System.out.println("StaticMethod 1");
        privateStaticMethod();
    }

    //private static 메서드
    private static void privateStaticMethod(){
        System.out.println("privateStaticMethod 1");
    }
}
