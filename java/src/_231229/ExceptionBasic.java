package _231229;

public class ExceptionBasic {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        int[] array = {1, 2, 3, 4, 5};
        arrayLength(array);
        System.out.println("[프로그램 종료]");
    }

    private static void arrayLength(int[] array) {
        try {
            for (int i = 0; i < array.length + 1; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("배열의 범위를 벋어났습니다.");
            ae.printStackTrace();
        }
    }
}
