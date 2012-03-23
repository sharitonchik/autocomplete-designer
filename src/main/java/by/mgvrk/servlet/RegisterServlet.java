package by.mgvrk.servlet;

import by.mgvrk.entity.User;
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

        User user = new User();
        user.setName(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        user.setCountry(req.getParameter("country"));
        user.setPhone(req.getParameter("phone"));
        user.setEmail(req.getParameter("email"));
        user.setGender(req.getParameter("gender"));
        user.setRole("user");

        if (serviceDao.registerUser(user)) {
            resp.sendRedirect("good.jspx");
        } else {
            resp.sendRedirect("registration_fail.jspx");
        }

    }

}
