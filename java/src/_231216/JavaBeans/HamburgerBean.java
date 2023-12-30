package _231216.JavaBeans;

public class HamburgerBean {
    //빵, 패티, 치즈, 토마토, 베이컨
    private int bun;
    private int patty;
    private int cheese;
    private int tomato;
    private int bacon;

    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }

    public void showList(){
        System.out.println(bun + ", " + patty + ", " + cheese + ", " + tomato + ", " + bacon);
    }
}
