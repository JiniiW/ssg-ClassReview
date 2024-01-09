package _240109;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

//8. 필터, 매핑, 축소 연산을 사용하여 정수 리스트의 모든 짝수의 총합을 구하세요.
public class Quiz8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("list에 넣을 정수를 10개 입력해주세요 : ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        Function<List<Integer>, Integer> finalSumOfList = (numbers) -> numbers.stream()
                .filter(number -> number % 2 == 0) //필터링
                .mapToInt(Integer::intValue) //매핑
                .sum(); //축소연산

        int result = finalSumOfList.apply(list);

        System.out.printf("리스트의 짝수의 합 : %d", result);


    }
}
