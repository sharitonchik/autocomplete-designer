package by.mgvrk.servlet;

import by.mgvrk.dao.UserDao;
import by.mgvrk.dao.builder.BuilderDao;
import by.mgvrk.entity.User;
import by.mgvrk.util.ServerHandling;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * UserDao: sharitonchik
 */
public class RegisterServlet extends HttpServlet {
    ServerHandling server;

    @Override
    public void init() throws ServletException {
        server = new ServerHandling();
        server.startServer();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        BuilderDao builderDao = new BuilderDao();

        if (builderDao.registerUser(name, password)) {
            req.getRequestDispatcher("/good.jspx").forward(req, resp);
        } else {
            req.getRequestDispatcher("/registration_fail.jspx").forward(req, resp);
        }
    }

    @Override
    public void destroy() {
        server.stopServer();
    }
}
