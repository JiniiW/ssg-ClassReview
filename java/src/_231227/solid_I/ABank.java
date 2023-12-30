package _231227.solid_I;

/**
 * packageName : _231227.solid_I
 * fileName : ABank
 * author : 김소진
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class ABank implements PersonalFinance, EnterpriseFinance {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.sendMessage(this.getClass().getSimpleName(), Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.sendMessage(this.getClass().getSimpleName(), Duty.ENTERPRISE_FINANCE));
    }

}
