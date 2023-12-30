package _231214.oop;

public class StudentMain {
    public static void main(String[] args) {
        //학생 2명의 이름과 과목을 입력받아 출력
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "홍길동";
        s1.major = "컴퓨터 공학";

        s2.name = "김연아";
        s2.major = "건축학";

        System.out.println(s1.name + s1.major);
        System.out.println(s2.name + s2.major);

        s1.study();

        String food = s2.food("곰탕");
        System.out.println(food);

    }
}
