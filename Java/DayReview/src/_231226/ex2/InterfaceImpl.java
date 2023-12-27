package _231226.ex2;

public class InterfaceImpl implements InterfaceC{
    @Override
    public void interfaceA() {
        System.out.println("interfaceA 호출");
    }

    @Override
    public void interfaceB() {
        System.out.println("interfaceB 호출");

    }

    @Override
    public void interfaceC() {
        System.out.println("interfaceC 호출");

    }
}
