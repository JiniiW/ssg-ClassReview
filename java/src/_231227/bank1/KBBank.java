package _231227.bank1;

public class KBBank implements Bank {
    @Override
    public void withDraw(int price) {
        System.out.println("KB은행만의 인출 로직...");
        if(MAX_INTEGER > price){
            System.out.println(price + "원을 인출한다.");
        } else {
            System.out.println("잔액이 부족하여 인출할 수 없다");
        }
    }

    @Override
    public void deposit(int price) {
        System.out.println("KB은행만의 입금 로직" + price + "원을 입금한다.");
    }
}
