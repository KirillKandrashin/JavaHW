import services.UserService;
import models.User;

public class Main {
    public static void main(String[] args){
        UserService userService = new UserService();
        User user = new User("Misha", 26);
        userService.saveUser(user);
        System.out.println("Save user" + user);

        //User user1 = userService.findUser()
    }
}
