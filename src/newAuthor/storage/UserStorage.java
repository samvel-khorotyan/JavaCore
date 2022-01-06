package newAuthor.storage;

import newAuthor.model.User;
import newAuthor.util.ArrayUtil;
import newAuthor.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    private Map<String, User> userMap = new HashMap<>();

    public void add(User user) {
        userMap.put(user.getEmail(), user);
        FileUtil.serializeUserMap(userMap);
    }

    public User getByEmail(String email) {
        return userMap.get(email);
    }

    public void print() {
        ArrayUtil.print(userMap.values().toArray());
    }

    public void initData() {
        Map<String, User> userMapFromMap = FileUtil.DeSerializeUserMap();
        if (userMapFromMap != null) {
            userMap = userMapFromMap;
        }
    }
}
