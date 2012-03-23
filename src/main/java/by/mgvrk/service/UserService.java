package by.mgvrk.service;

import by.mgvrk.dao.*;
import by.mgvrk.entity.User;
import com.mysql.jdbc.Statement;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class UserService {
    private DBConnection dbConnection;
    private UserDao userDao;
    private DataUserDao dataUserDao;
    private RoleDao roleDao;
    private ProjectsDao projectsDao;

    public UserService() {
        dbConnection = DBConnection.getInstance();

        userDao = new UserDao(dbConnection);
        dataUserDao = new DataUserDao(dbConnection);
        roleDao = new RoleDao(dbConnection);
        projectsDao = new ProjectsDao(dbConnection);
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

    private boolean doCommand(String command, User user) {
        boolean result = false;

        dbConnection.startTransaction();
        try {
            if (command.equals("register")) {
                userDao.setUser(user);
                dataUserDao.setDataUser(user);
                result = true;
            }

            if (command.equals("check")) {
                result = userDao.checkUser(user.getName(), user.getPassword());
            }

            if (command.equals("access")) {
                roleDao.getRole(user);
                result = true;
            }

            if (command.equals("addProject")) {
                result = projectsDao.setProject(user.getProject());
            }

            dbConnection.commitTransaction();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            dbConnection.rollBackTransaction();
            result = false;
        }
        return result;
    }
}
