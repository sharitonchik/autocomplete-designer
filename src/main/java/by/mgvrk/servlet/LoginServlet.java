package by.mgvrk.servlet;

import by.mgvrk.entity.User;
import by.mgvrk.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User: sharitonchik
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService serviceDao = new UserService();

        User user = new User();
        user.setName(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));

        if (serviceDao.isRegistered(user)) {
            System.out.println("registered");
        } else {
            resp.sendRedirect("index.jspx");
        }
    }
}
