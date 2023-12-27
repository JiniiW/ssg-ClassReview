package _231219.Cat;

public class BabyCat extends ParentCat{
    private String color;
    public BabyCat(String breed, String color){
        super(breed); //부모의 breed 생성
        this.color = color;
    }
    public void meow(){
        System.out.println("야옹하고 울다");
    }

    public void getColor() {
        System.out.printf("색상 : %s\n", color);
    }
    @Override
    public void eat(){
        super.eat(); //부모 클래스의 eat 메서드 호출
        System.out.println("자식도 같이 eat 하자");
    }

}
