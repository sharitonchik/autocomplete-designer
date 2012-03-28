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
        session = HibernateHelper.getSessionFactory().getCurrentSession();
        BaseInitialisation baseInitialisation  = new BaseInitialisation(session);
        baseInitialisation.createTables();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        session.close();
    }
}
