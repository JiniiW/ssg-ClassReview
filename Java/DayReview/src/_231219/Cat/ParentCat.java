package _231219.Cat;

public class ParentCat {
    private String breed;
    public ParentCat(String breed){
        this.breed = breed;
    }
    public void eat(){
        System.out.println("먹이를 먹다.");
    }

    public void getBreed() {
        System.out.printf("품종 : %s\n", breed);
    }
}
