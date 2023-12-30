package _231219.cal;

public class Calculation {
    private int num1;
    private int num2;

    public Calculation(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void addition(){
        System.out.printf("두 수의 덧셈 : %d\n", num1 + num2);
    }
    public void subtraction(){
        System.out.printf("두 수의 뺄셈 : %d\n", num1 - num2);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
