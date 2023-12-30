package _231219.cal;

public class SubCalculation extends Calculation{
    public SubCalculation(int num1, int num2){
        super(num1, num2);
    }

    public void multiplication(){
        System.out.printf("두 수의 곱셈 : %d\n", getNum1() * getNum2());
    }
}
