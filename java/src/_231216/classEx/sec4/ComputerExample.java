package _231216.classEx.sec4;

public class ComputerExample {
	public static void main(String[] args) {
		//Computer 객체 생성
		Computer computer = new Computer();

		//sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
		//합산 결과를 리턴 받아 result1 변수에 대입
		int result1 = computer.sum(1,2,3);
		System.out.println(result1);

		//sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고
		//합산 결과를 리턴 받아 result2 변수에 대입
		int result2 = computer.sum(1,2,3,4,5);
		System.out.println(result2);

		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴 받아 result3 변수에 대입
		int[] number = {1,2,3};
		int result3 = computer.sum(number);
		System.out.println(result3);

	}
}