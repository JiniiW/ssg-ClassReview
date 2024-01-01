package _240101;

//String class의 생성자와 메서드
public class ObjectStringEx {
    public static void main(String[] args) {
        //1. 기본
        String first = new String("Hello");
        System.out.println(first);

        //2. char 배열로 String 생성
        char[] arrays = {'H', 'e', 'l', 'l', 'o'};
        String second = new String(arrays);
        System.out.println(second);

        //3. StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        String third = new String(sb);
        System.out.println(third);

        //4. [Char] charAt
        String fourth = "Hello";
        char one = fourth.charAt(0);
        System.out.println(one);

        //5. [Int] compareTo
        String str1 = "aaa";
        String str2 = "bbb";

        int i = "aaa".compareTo(str1);
        System.out.println(i); //0
        int i2 = str2.compareTo(str1);
        System.out.println(i2); //1
        int i3 = str1.compareTo(str2);
        System.out.println(i3); //-1

        //6. concat
        String s = "Hello";
        s = s.concat("World");
        System.out.println(s);

        //7. [boolean] contain
        String fifth = "Hello";
        Boolean result = fifth.contains("a");
        System.out.println(result);

        //8. [boolean] endWith / startWith
        String sixth = "Hello.txt";
        Boolean result2 = sixth.endsWith("txt");
        Boolean result7 = sixth.endsWith("Hello");
        System.out.println(result2);
        System.out.println(result7);

        //9. [boolean] equals
        //10. [boolean] equalsIgnoreCase / toLowerCase

        //11. [int] indexOf
        String seventh = "Hello";
        int result3 = seventh.indexOf("e");
        System.out.println(result3); //1
        //11. [int] indexOf
        int result4 = seventh.indexOf("e", 2);
        System.out.println(result4); //-1

        //12. intern

        //13. [int] lastIndexOf

        //14. replace, replaceAll, replaceFirst

        //15. String[] split

        //16. subString

        //17. trim()
    }
}
