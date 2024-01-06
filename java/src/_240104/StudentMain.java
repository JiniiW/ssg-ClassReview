package _240104;

//Comparable을 이용해 정렬하자

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Dave", 20240001, 4.2);
        students[1] = new Student("Amie", 20160001, 4.5);
        students[2] = new Student("Emma", 20110001, 3.5);
        students[3] = new Student("Brad", 20130001, 2.8);
        students[4] = new Student("Cara", 20140001, 4.2);

        //기본 정렬
        System.out.println("===기본정렬===");
        Arrays.sort(students); //확정 정렬로 다시
        Arrays.stream(students).forEach(student -> System.out.printf("이름 : %s | 학번 : %d 성적 : %.1f\n", student.name, student.id, student.score));

        //추가 정렬 조건 : 성적이 높은 순(학점 내림차순), 성적이 같으면 학번이 높은 순(학번 오름차순)
        System.out.println("===추가정렬===");
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.score == o2.score){
                    return Integer.compare(o1.id, o2.id); //오름차순
                }
                return Double.compare(o2.score, o1.score); //내림차순
            }
        });

        //출력
        Arrays.stream(students).limit(2).forEach(number -> System.out.printf("성적 장학금을 받을 학생 -> 이름 : %s | 학번 : %d 성적 : %.1f\n", number.name, number.id, number.score));
    }
}
