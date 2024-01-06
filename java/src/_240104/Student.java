package _240104;

//기본 정렬 조건 : 학번 순

public class Student implements Comparable<Student>{
    String name;
    int id;
    double score;

    public Student(String name, int id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "학번 : " + id + "학점 : " + score;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id; //오름차순
    }
}
