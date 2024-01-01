package _240101;

public class StringBufferClassEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println(sb.equals(sb2)); //값 비교
        System.out.println(sb == sb2); //주소 비교

        //toString으로 변환하여 값 밗
        String s = sb.toString();
        String s2 = sb2.toString();
        System.out.println(s.equals(s2)); //true
        System.out.println(s == s2); //false

        int i = sb.capacity();
        System.out.println(i); //16+3
    }
}
