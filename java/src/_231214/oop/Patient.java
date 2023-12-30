package _231214.oop;

public class Patient {
    public String name;
    public String gender;
    public int age;

    public Patient(){}

    public Patient(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void patientInformation(){
        System.out.println("환자의 이름은 " + name + "이고, 성별은 " + gender + " 나이는 " + age + "이다.");
    }
}
