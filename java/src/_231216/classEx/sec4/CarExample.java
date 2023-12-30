package _231216.classEx.sec4;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();

		//리턴값이 없는 setGas() 메소드 호출
		myCar.setGas(0);

		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		Boolean result = myCar.isLeftGas();
		if(result == true){
			System.out.println("가스가 아직 남아있습니다.");
		} else {
			System.out.println("가스가 부족합니다.");
		}
	}
}