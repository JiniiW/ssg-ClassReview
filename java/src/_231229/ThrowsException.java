package _231229;

public class ThrowsException {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (Exception e){
            System.out.println("예외처리 : " + e.getMessage());
        }
    }
    //Exception 타입의 예외를 던질 수 있다. -> main에서 처리
    public static void performOperation() throws Exception{
        //실제로 예외를 발생시킨다.
        throw new Exception("예외가 발생했습니다.");
    }
}
