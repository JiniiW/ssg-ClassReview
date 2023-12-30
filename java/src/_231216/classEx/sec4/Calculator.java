package _231216.classEx.sec4;

public class Calculator {
    Boolean power = false;
	//리턴값이 없는 메소드 선언
    public void powerOn(){
        power = true;
        System.out.println("powerON");
    }
	//리턴값이 없는 메소드 선언
    public void powerOff(){
        power = false;
        System.out.println("powerOFF");
    }
	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public int add(int num1, int num2){
        return num1 + num2;
    }

	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    public double divide(int num1, int num2){
       return num1 / num2;
    }

}