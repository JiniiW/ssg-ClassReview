package _231214.message;

public class C {
    public static void main(String[] args) {
        //B타입의 x1객체에 b1() 리턴타입으로 작성
        //(요구조건) A타입의 a1메서드에서 값을 받아서
        //"A클래스의 data는 B타입의 x1객체에서 처리하였습니다."
        A a = new A();
        B b = new B();

        String data = a.a1();
        String result = b.b1(data);
        System.out.println(result);
    }
}
