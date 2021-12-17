package author.storage;

import author.model.User;
import author.util.ArrayUtil;

public class UserStorage {

    private User[] users = new User[10];
    private int size;

    public void add(User user){
        if (size == users.length){
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] users1 = new User[users.length + (users.length / 2)];
        System.arraycopy(users,0,users1,0,users.length);
        users = users1;
    }

    public User getByEmail(String email){
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)){
                return users[i];
            }
        }
        return null;
    }

    public void print(){
        ArrayUtil.print(users,size);
    }
}
