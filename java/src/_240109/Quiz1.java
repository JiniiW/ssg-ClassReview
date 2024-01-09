package _240109;

import java.util.Arrays;
import java.util.List;

//1. 정수 리스트가 주어졌을 때 자바 람다를 사용하여 리스트에 있는 모든 짝수의 합을 계산하세요.
public class Quiz1 {
    public static void main(String[] args) {
        List<Integer> numbsers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //메서드 참조 방법
        int sumOfEvenNum = numbsers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.printf("List 짝수의 합 : %d", sumOfEvenNum);
    }
}
