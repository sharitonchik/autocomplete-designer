package by.mgvrk.servlet;

import by.mgvrk.dao.BaseInitialisation;
import by.mgvrk.util.HibernateHelper;
import org.hibernate.Session;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: sharitonchik
 */
public class ApplicationListener implements ServletContextListener {
    Session session;

    public void contextInitialized(ServletContextEvent sce) {
        if (sce.getServletContext().getInitParameter("environment").equals("dev")) {
            session = HibernateHelper.getSessionFactory().getCurrentSession();
            BaseInitialisation baseInitialisation = new BaseInitialisation(session);
            baseInitialisation.rowInit();
            session.close();
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
//        session.disconnect();
//        session.close();
    }
}
