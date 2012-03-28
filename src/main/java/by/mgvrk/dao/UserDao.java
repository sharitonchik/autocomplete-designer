package by.mgvrk.dao;

import by.mgvrk.entity.user.Role;
import by.mgvrk.entity.user.User;
import org.hibernate.Session;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

/**
 * UserDao: sharitonchik
 */
public class UserDao extends Dao {

    public UserDao(Session session) {
        super(session);
    }

    public void setUser(User user) throws SQLException {
        session.save(user);
    }


    public boolean checkUser(String login, String password) throws SQLException {
        boolean result = false;
        List users = session.createQuery("from User").list();
        for (int i = 0; i < users.size(); i++) {
            User user = (User) users.get(i);
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
