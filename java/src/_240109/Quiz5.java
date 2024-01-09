package _240109;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

//5. 정수 리스트를 받아 리스트에 모든 숫자의 곱을 반환하는 람다 표현식을 작성하세요.
public class Quiz5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("list에 넣을 정수를 10개 입력해주세요 : ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            list.add(input.nextInt());
        }

        Function<List<Integer>, Integer> multiplication = (numbers) -> numbers.stream()
                .reduce(1, (num1, num2) -> num1 * num2);

        int result = multiplication.apply(list);

        System.out.printf("list의 모든 숫자의 곱 : %d", result);
    }
}
