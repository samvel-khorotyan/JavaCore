package education.storage;

import education.exception.UserNotFoundException;
import education.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    private Map<String, User> usersMap = new HashMap<>();

    public void add(User user) {
        usersMap.put(user.getEmail(), user);
    }

    public void print() {
        for (Map.Entry<String, User> stringUserEntry : usersMap.entrySet()) {
            System.out.println(stringUserEntry);
        }
    }

    public User getByEmail(String email) throws UserNotFoundException {
        for (Map.Entry<String, User> stringUserEntry : usersMap.entrySet()) {
            if (stringUserEntry.getKey().equals(email)) {
                return stringUserEntry.getValue();
            }
        }
        throw new UserNotFoundException("Email does not exist " + email);
    }
}
