package servlet;

import dao.UserDao;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * UserDao: sharitonchik
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        User user = new User(1, name, password);
        UserDao userDao = new UserDao();
        if (userDao.addUser(user)) {
            req.getRequestDispatcher("/index.jspx").forward(req, resp);
        } else {
            req.getRequestDispatcher("/registration_fail.jspx").forward(req, resp);
        }
    }
}
