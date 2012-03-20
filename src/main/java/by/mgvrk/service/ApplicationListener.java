package by.mgvrk.service;

import by.mgvrk.util.HsqlServer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: sharitonchik
 */
public class ApplicationListener implements ServletContextListener {
    HsqlServer server;
    DBConnection dbConnection;

    public void contextInitialized(ServletContextEvent sce) {
        server = new HsqlServer();
        server.startServer();

        dbConnection = DBConnection.getInstance();
        dbConnection.createTables();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        dbConnection.closeConnection();
        server.stopServer();
    }
}
