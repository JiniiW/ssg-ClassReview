package _231219.shoppingMall;


public class UserService {
    private User user;

    public UserService(String nameUser, String phoneNumber) {
        this.user = new User(nameUser, phoneNumber);
    }

    void displayUser() {
        System.out.println(user.toString());
    }
}
