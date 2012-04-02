package by.mgvrk.dao;

import by.mgvrk.entity.user.Role;
import by.mgvrk.entity.user.User;
import org.hibernate.HibernateException;
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

    public void setUser(User user) throws HibernateException {
        session.save(user);
    }


    public boolean checkUser(String login, String password) {
        List users = getUserList();

        for (int i = 0; i < users.size(); i++) {
            User user = (User) users.get(i);
            if (password == null) {
                if (user.getLogin().equals(login)) {
                    return true;
                }
            } else if (login == null) {
                if (user.getPassword().equals(password)) {
                    return true;
                }
            } else {
                if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    private List getUserList() {
        List users = null;
        session.beginTransaction();

        try {
            users = session.createQuery("from User").list();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace(System.out);
            session.getTransaction().rollback();
        }
        return users;
    }
}
