package by.mgvrk.dao.builder;

import by.mgvrk.dao.UserDao;
import by.mgvrk.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * User: sharitonchik
 */
public class BuilderDao {
    UserDao userDao;
    List<User> users = new ArrayList<User>();

    public BuilderDao() {
        userDao = new UserDao();
    }

    public boolean registerUser(String name, String password) {
        User user = new User(1, name, password);
        addUserToList(user);
        return userDao.addUser(user);
    }

    private void addUserToList(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
