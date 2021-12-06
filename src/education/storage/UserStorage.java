package education.storage;

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

    public User getByType(String type) {
        for (int i = 0; i < size; i++) {
            if (users[i].getType().equals(type)) {
                return users[i];
            }
        }
        return null;
    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    public User getByPassword(String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }
}
