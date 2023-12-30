package _231223.ex1;

import java.util.SortedMap;

public class Account {
    private int balance;
    public void deposit(int money){
        balance += money;
        System.out.printf("입금하신 금액은 %d원 입니다.\n남은 금액은 %d원 입니다.\n", money, balance);
    }
}
