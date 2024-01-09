package _240109;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

//6. 정수 리스트의 평균을 구하는 프로그램을 작성해세요.
public class Quiz6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("list에 넣을 정수를 10개 입력해주세요 : ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            list.add(input.nextInt());
        }

        Function<List<Integer>, Double> average = (numbers) -> numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        double result = average.apply(list);

        System.out.printf("list의 모든 숫자의 평균 : %.2f", result);
    }
}
