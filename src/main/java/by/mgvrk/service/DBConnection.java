package by.mgvrk.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class DBConnection {
    private static DBConnection instance = null;
    private static Connection connection;

    private DBConnection() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");

            connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost:1234/testdb", "SA", "");

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                //ignore
            }
        }
    }

    public void startTransaction() {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public void commitTransaction() {
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public void rollBackTransaction() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public void createTables() {
        createTableUsers();
        createTableDataUser();
        createTableRoles();
        createTableProjects();
    }

    private void createTableUsers() {
        try {
            connection
                    .createStatement()
                    .executeQuery("CREATE TABLE USERS (ID int, login varchar(20), password varchar(20));");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    private void createTableDataUser() {
        try {
            connection
                    .createStatement()
                    .executeQuery("CREATE TABLE DATA_USER (ID int, country varchar(20)," +
                            " phone varchar(20),email varchar(20), gender varchar(20));");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    private void createTableRoles() {
        try {
            connection
                    .createStatement()
                    .executeQuery("CREATE TABLE ROLES (ID int, role varchar(20));");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    private void createTableProjects() {
        try {
            connection
                    .createStatement()
                    .executeQuery("CREATE TABLE PROJECTS (ID int, ID_users int, name_project varchar(20));");
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }

    public PreparedStatement getPreparedStatement(String sqlQuery) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return statement;
    }
}
