package _240101;
//StringJoiner 클래스

import java.util.StringJoiner;

public class StringClassEx {
    public static void main(String[] args) {
        String animal = "dog, cat, tiger";
        String[] arr = animal.split(", 1");

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for(String value : arr){
            sj.add(value);
        }

        //출력
        System.out.println(sj.toString());
    }
}
