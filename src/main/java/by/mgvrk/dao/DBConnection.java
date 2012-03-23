package by.mgvrk.dao;

import com.mysql.jdbc.DatabaseMetaData;

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
//            Class.forName("org.hsqldb.jdbcDriver");
            Class.forName("org.gjt.mm.mysql.Driver");

//            connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost:1234/testdb", "SA", "");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

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

    public PreparedStatement getPreparedStatement(String sqlQuery) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return statement;
    }

    public DatabaseMetaData getConnectionMetaData() {
        try {
            return (DatabaseMetaData) connection.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
