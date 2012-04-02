package by.mgvrk.servlet;

import by.mgvrk.entity.user.User;
import by.mgvrk.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * User: sharitonchik
 */
public class CheckParamServlet extends HttpServlet {
    private UserService userService;
    private PrintWriter answer;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService = new UserService();
        answer = resp.getWriter();

        if (req.getParameter("login") != null) {
            checkLogin(req.getParameter("login"), resp);
        }
        if (req.getParameter("password") != null) {
            checkPassword(req.getParameter("password"), resp);
        }

    }

    private void checkLogin(String login, HttpServletResponse resp) {
        User user = new User();
        user.setLogin(login);
        if (userService.checkLogin(user)) {
            resp.setHeader("Content-Type", "text/html");
            answer.write("Login is exist!!");
            answer.close();
        }
    }

    private void checkPassword(String password, HttpServletResponse resp) {
        User user = new User();
        user.setPassword(password);
        if (userService.checkLogin(user)) {
            resp.setHeader("Content-Type", "text/html");
            answer.write("Password is exist!!");
            answer.close();
        }
    }
}
