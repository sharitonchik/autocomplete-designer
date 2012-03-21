package by.mgvrk.service;

import by.mgvrk.dao.DataUserDao;
import by.mgvrk.dao.ProjectsDao;
import by.mgvrk.dao.RoleDao;
import by.mgvrk.dao.UserDao;
import by.mgvrk.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class ServiceDao {
    DBConnection dbConnection;
    UserDao userDao;
    DataUserDao dataUserDao;
    RoleDao roleDao;
    ProjectsDao projectsDao;

    public ServiceDao() {
        dbConnection = DBConnection.getInstance();
        userDao = new UserDao();
        dataUserDao = new DataUserDao();
        roleDao = new RoleDao();
        projectsDao = new ProjectsDao();
    }

    public boolean registerUser(HttpServletRequest req) {

        User user = new User();

        user.setID(1);
        user.setName(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        user.setCountry(req.getParameter("country"));
        user.setPhone(req.getParameter("phone"));
        user.setEmail(req.getParameter("email"));
        user.setGender(req.getParameter("gender"));
        user.setRole("user");

        return addUser(user);
    }

    private boolean addUser(User user) {
        dbConnection.startTransaction();
        try {
            userDao.setUser(user);
            roleDao.setRole(user);
            dataUserDao.setDataUser(user);

            dbConnection.commitTransaction();

            return true;
        } catch (SQLException e) {
            dbConnection.rollBackTransaction();
            e.printStackTrace(System.out);

            return false;
        }
    }

    public boolean isRegistered(HttpServletRequest req) {
        dbConnection.startTransaction();
        try {
            if (userDao.checkUser(req.getParameter("login"),
                    req.getParameter("password"))) {
                dbConnection.commitTransaction();

                return true;
            } else {
                dbConnection.rollBackTransaction();

                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);

            return false;
        }
    }

    public boolean addProject(HttpServletRequest req) {
        dbConnection.startTransaction();
        try {
            projectsDao.setProject(req.getParameter("project_name"));
            dbConnection.commitTransaction();

            return true;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            dbConnection.rollBackTransaction();

            return false;
        }
    }
}
