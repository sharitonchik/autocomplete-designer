package by.mgvrk.servlet;

import by.mgvrk.dao.BaseInitialisation;
import by.mgvrk.dao.DBConnection;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: sharitonchik
 */
public class ApplicationListener implements ServletContextListener {
    DBConnection dbConnection;

    public void contextInitialized(ServletContextEvent sce) {
        dbConnection = DBConnection.getInstance();
        BaseInitialisation baseInitialisation = new BaseInitialisation(dbConnection);
        baseInitialisation.createTables();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        dbConnection.closeConnection();
    }
}
