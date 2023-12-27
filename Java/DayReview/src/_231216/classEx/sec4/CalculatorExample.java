package _231216.classEx.sec4;

public class CalculatorExample {
	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator calculator = new Calculator();
		
		//리턴값이 없는 powerOn() 메소드 호출
		calculator.powerOn();

		//plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴 받아 result1 변수에 대입
		int result1 = calculator.add(5, 6);
		System.out.println(result1);


		//divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴 받아 result2 변수에 대입
		double result2 = calculator.divide(9,2);
		System.out.printf("%.2f", result2);
		System.out.println();

		//리턴값이 없는 powerOff() 메소드 호출
		calculator.powerOff();

	}
}