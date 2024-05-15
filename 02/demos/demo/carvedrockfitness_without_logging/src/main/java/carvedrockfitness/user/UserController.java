package carvedrockfitness.user;


import java.util.List;

public class UserController {
    private static final UserService userService = new UserService();

    //get all endpoint
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //get by carvedrockfitness.user.UserStatus
    public List<User> getAllUsersByUserStatus(UserStatus userStatus) {
        return userService.getAllUsersByUserStatus(userStatus);
    }

    //post endpoint
    public boolean addUser(User user) {
        return userService.addUser(user);
    }

    //delete
    public boolean deleteUser(User user) {
        return userService.deleteUser(user);
    }
}
