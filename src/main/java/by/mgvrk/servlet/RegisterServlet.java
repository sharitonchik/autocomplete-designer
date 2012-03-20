package by.mgvrk.servlet;

import by.mgvrk.service.ServiceDao;
import by.mgvrk.util.HsqlServer;

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
        ServiceDao serviceDao = new ServiceDao();

        if (serviceDao.registerUser(req)) {
            req.getRequestDispatcher("/good.jspx").forward(req, resp);
        } else {
            req.getRequestDispatcher("/registration_fail.jspx").forward(req, resp);
        }
    }

}
