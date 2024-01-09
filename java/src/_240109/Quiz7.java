package _240109;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

//7. 두 개의 정수를 매개변수로 받아 그 합계를 반환하는 계산이라는 메서드가 있는 MathOperation이라는 함수형 페이스
public class Quiz7 {
    @FunctionalInterface
    interface MathOperation{
        int sum(int num1, int num2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MathOperation sumOfInteger = (num1, num2) -> num1 + num2;

        System.out.print("첫 번째 정수 입력 : ");
        int num1 = input.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int num2 = input.nextInt();

        int result = sumOfInteger.sum(num1, num2);
        System.out.printf("두 정수의 합 = %d",result);
    }
}
