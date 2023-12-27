package _231216.classEx.sec4;

public class Computer {
	//가변길이 매개변수를 갖는 메소드 선언
    public int sum(int...values){
        int total = 0;
        for(int i : values){
            total += i;
        }
        return total;
    }
}