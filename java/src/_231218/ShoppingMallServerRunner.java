package _231218;

import java.util.Scanner;

//실행
public class ShoppingMallServerRunner {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String nameUser = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String phoneNumber = sc.nextLine();
        ShoppingMallService shoppingMallService = new ShoppingMallService(sc, nameUser, phoneNumber);
        boolean flagLoop = true;
        while(flagLoop) {
            System.out.println("메뉴 번호를 선택해주세요 ");
            flagLoop = shoppingMallService.displayMenu();
        }
        sc.close();
    }
}
