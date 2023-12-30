package _231216.classEx.sec4;

public class Car {
	//필드 선언
    public int gas;

	//리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    public void setGas(int gas){
        this.gas = gas;
    }

	//리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
    public boolean isLeftGas(){
        boolean result = false;
        if(gas == 0){
            return false;
        } else {
            return true;
        }
    }

	//리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료


}