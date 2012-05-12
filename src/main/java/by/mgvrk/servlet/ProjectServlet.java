package by.mgvrk.servlet;

import by.mgvrk.util.ProjectSaver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ProjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date = new Date();
        ProjectSaver projectSaver = new ProjectSaver();

        if (req.getParameter("command").equals("create")) {
            projectSaver.createUserDir("testUser" + date.getTime(), req.getParameter("pname"));
        }
        if(req.getParameter("command").equals("write")){
              projectSaver.writeToFiles("testUser0\\" + req.getParameter("pname"),
                      req.getParameter("html"),
                      req.getParameter("css"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
