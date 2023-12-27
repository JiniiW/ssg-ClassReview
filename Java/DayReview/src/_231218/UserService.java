package _231218;
//회원 등록
//회원 이름, 전화번호 저장
class User {
    private String name;
    private String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n" + "연락처 : " + phone;
    }
}

public class UserService {
    private User user; //User의 생성자를 user로 저장

    public UserService(String nameUser, String phoneNumber) {
        this.user = new User(nameUser, phoneNumber);
    }
    //회원 이름, 전화번호 출력
    public void displayUser() {
        System.out.println(user.toString());
    }
}
