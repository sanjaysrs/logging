package carvedrockfitness.user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    //get all logic
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //get by carvedrockfitness.user.UserStatus logic
    public List<User> getAllUsersByUserStatus(UserStatus userStatus) {
        if (!userStatus.equals(UserStatus.DELETED)) {
            return userRepository.findByUserStatus(userStatus);
        } else {
            try {
                throw new Exception("Users with UserStatus cannot be get, because they formally don't exist.");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new ArrayList<>();
        }
    }

    //add carvedrockfitness.user logic
    public boolean addUser(User user) {
        if (user.getDateCreated().isAfter(LocalDateTime.now())) {
            try {
                throw new Exception("Can't carvedrockfitness.user.datecreated in the future!");
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        return userRepository.save(user);
    }

    //delete logic
    public boolean deleteUser(User user) {
        if (user.getUserStatus() == UserStatus.DELETED) {
            try {
                throw new Exception("Can't delete a deleted carvedrockfitness.user!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return userRepository.remove(user);
    }
}
