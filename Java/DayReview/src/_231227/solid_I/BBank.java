package _231227.solid_I;

/**
 * packageName : _231227.solid_I
 * fileName : BBank
 * author : 김소진
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class BBank implements PrivateBanking {
    @Override
    public void doPrivateBanking() {
        System.out.println(this.sendMessage(this.getClass().getSimpleName(), Duty.PB));
    }
}
