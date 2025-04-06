import java.util.*;
public class UserController {
    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(String userId){
        for(User user: userList){
            if(user.userId==userId){
                return user;
            }
        }
        return null;
    }
    
    public void addUser(User user){
        userList.add(user);
    }
    
}
