package _231229.customexception;

import java.util.Scanner;

public class CustomExceptionEx {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        try {
            NoPositiveNumber(value);
        } catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

    public static void NoPositiveNumber(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("음수는 작성할 수 없습니다.");
        } else {
            System.out.println("입력한 수 : " + value);
        }
    }
}
