package _231226.review2;

public class Baby implements Papa, Mama{
    @Override
    public void genderMother() {
        System.out.println("나는 아버지 입니다.");
    }

    @Override
    public void genderFather() {
        System.out.println("나는 어머니 입니다.");
    }

    public void printInfo(){
        System.out.println("나는 아기 입니다.");
    }
}
