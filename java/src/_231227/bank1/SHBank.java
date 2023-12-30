package _231227.bank1;

public class SHBank implements Bank {
    @Override
    public void withDraw(int price) {
        System.out.println("SH은행만의 인출 로직...");
        if (MAX_INTEGER > price) {
            System.out.println(price + "원을 인출한다.");
        } else {
            System.out.println("잔액이 부족하여 인출할 수 없다");
        }
    }

    @Override
    public void deposit(int price) {
        System.out.println("KB은행만의 입금 로직" + price + "원을 입금한다.");
    }

    public String findDormancyAccount(String custId) {
        System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다.");
        System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
        System.out.println("**SH은행만의 로직 적용**");
        return "00은행 000-000-0000-00";
    }

}
