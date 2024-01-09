package _240109;


import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

//2. 두 정수를 받아 그 합을 반환하는 람다 식을 작성하세요.
public class Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BiFunction<Integer, Integer, Integer> sumOfInteger = (num1, num2) -> num1 + num2;

        System.out.print("첫 번째 정수 입력 : ");
        int num1 = input.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int num2 = input.nextInt();


        int result = sumOfInteger.apply(num1, num2);
        System.out.printf("%d, %d 정수의 합 = %d", num1, num2, result);
    }
}
