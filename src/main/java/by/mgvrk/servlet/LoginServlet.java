package by.mgvrk.servlet;

import by.mgvrk.service.ServiceDao;

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
        ServiceDao serviceDao = new ServiceDao();

        if (serviceDao.isRegistered(req)) {
            System.out.println("registered");
        } else {
            req.getRequestDispatcher("/index.jspx").forward(req, resp);
        }
    }
}
