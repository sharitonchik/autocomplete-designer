package by.mgvrk.service;

import by.mgvrk.dao.*;
import by.mgvrk.entity.user.User;
import by.mgvrk.util.HibernateHelper;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class UserService {
    //hello world
    private Session session;
    private UserDao userDao;
    private DataUserDao dataUserDao;
    private RoleDao roleDao;
    private ProjectsDao projectsDao;

    public UserService() {
        session = HibernateHelper.getSessionFactory().getCurrentSession();

        userDao = new UserDao(session);
        dataUserDao = new DataUserDao(session);
        roleDao = new RoleDao(session);
        projectsDao = new ProjectsDao(session);
    }

    public boolean registerUser(User user) {
        return doCommand("register", user);
    }

    public boolean isRegistered(User user) {
        return doCommand("check", user);
    }

    public boolean addProject(User user) {
        return doCommand("addProject", user);
    }

    public boolean getAccessLevel(User user) {
        return doCommand("access", user);
    }

    public boolean checkLogin(User user) {
        return userDao.checkUser(user.getLogin(), user.getPassword());
    }

    private boolean doCommand(String command, User user) {
        boolean result = false;

        session.getTransaction().begin();
        try {
            if (command.equals("register")) {
                user.setRole(roleDao.getUserRole().getID());
                userDao.setUser(user);
                result = true;
            }
            if (command.equals("access")) {
                roleDao.getRole(user);
                result = true;
            }

            if (command.equals("addProject")) {
                projectsDao.setProject("", user);
            }
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace(System.out);
            session.getTransaction().rollback();
            result = false;
        }
        return result;
    }
}
