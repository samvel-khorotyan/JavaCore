package education.storage;

import education.exception.UserNotFoundException;
import education.model.User;

import education.util.ArrayUtil;

public class UserStorage {

    private User[] users = new User[10];
    private int size;

    public void add(User object) {
        if (size == users.length) {
            extend();
        }
        users[size++] = object;
    }

    private void extend() {
        User[] users1 = new User[users.length + (users.length / 2)];
        System.arraycopy(users, 0, users1, 0, users.length);
        users = users1;
    }

    public void print() {
        ArrayUtil.print(users, size);
    }

    public User getByEmail(String email) throws UserNotFoundException {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("Email does not exist " + email);
    }
}
