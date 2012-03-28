package by.mgvrk.servlet;

import by.mgvrk.entity.user.DataUser;
import by.mgvrk.entity.user.User;
import by.mgvrk.service.UserService;

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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService serviceDao = new UserService();

        if (serviceDao.registerUser(createUser(req))) {
            resp.sendRedirect("good.jspx");
        } else {
            resp.sendRedirect("registration_fail.jspx");
        }

    }

    private User createUser(HttpServletRequest req) {
        User user = new User();
        DataUser dataUser = new DataUser();

        user.setLogin(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));

        dataUser.setCountry(req.getParameter("country"));
        dataUser.setPhone(req.getParameter("phone"));
        dataUser.setEmail(req.getParameter("email"));
        dataUser.setGender(req.getParameter("gender"));

        user.setDataUsers(dataUser);
        return user;
    }

}
