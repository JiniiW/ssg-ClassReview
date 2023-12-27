package _231219.Cat;

import _231214.message.B;

public class CatMain {
    public static void main(String[] args) {
        BabyCat babyCat= new BabyCat("샴고양이", "초콜릿색");
        babyCat.getBreed(); //부모 필드에서 private으로 필드를 선언했기 때문에 get메서드 사용
        babyCat.getColor(); //부모 필드에서 private으로 필드를 선언했기 때문에 get메서드 사용
        babyCat.eat();
        babyCat.meow();
    }
}
