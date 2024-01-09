package _240109;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

//4. 정수의 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식을 작성하세요.
public class Quiz4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("list에 넣을 정수를 10개 입력해주세요 : ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            list.add(input.nextInt());
        }


        Function<List<Integer>, Integer> sumOfList = (numbers) -> numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int result = sumOfList.apply(list);

        System.out.printf("list에 저장된 짝수의 총 합 : %d", result);


    }
}
