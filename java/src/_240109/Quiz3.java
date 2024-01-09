package _240109;


import java.util.Scanner;
import java.util.function.Function;

//3. 문자열을 받아 그 길이를 반환하는 람다 표현힉을 작성하세요.
public class Quiz3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Function<String, Integer> stringLength = (string) -> string.length();

        System.out.print("문자열을 입력하세요 : ");
        String string = input.nextLine();

        int result = stringLength.apply(string);
        System.out.printf("%s의 길이는 %d 입니다.", string, result);

    }
}
