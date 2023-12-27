package _231223.ex2;

public class Main {
    public static void main(String[] args) {
        //집약관계
        Wifi internet = new Wifi();
        MyNotebook myNotebook = new MyNotebook(internet);
        //합성관계
        MyNotebook2 myNotebook2 = new MyNotebook2();
    }
}
