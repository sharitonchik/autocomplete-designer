package by.mgvrk.util;

import by.mgvrk.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public abstract class ExceptionHandlerTemplateDao {
    Connection connection;

    public Connection createConnection() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found");
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost:1234/testdb", "SA", "");
//            connection.createStatement().executeQuery("CREATE TABLE users (ID int, name varchar(20), password varchar(20));");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return connection;
        }
    }

    public boolean process(String sqlQueryString) {
        return process(sqlQueryString, null);
    }

    public boolean process(String sqlQueryString, User user) {
        connection = createConnection();
        if (connection != null) {
            try {
                connection.setAutoCommit(false);


                PreparedStatement statement = null;
                try {
                    statement = connection.prepareStatement(sqlQueryString);
                    executeQueryString(statement, user);
                } finally {
                    if (statement != null) {
                        statement.close();
                    }
                }

                connection.commit();
                return true;
            } catch (Exception e) {
                try {
                    e.printStackTrace(System.out);

                    connection.rollback();
                } catch (SQLException e1) {
                    //ignore
                }
            } finally {
                closeConnectionQuietly(connection);
            }
            return false;
        } else {
            return false;
        }
    }

    private void closeConnectionQuietly(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                //ignore
            }
        }
    }

    public abstract void executeQueryString(PreparedStatement statement, User user) throws SQLException;
}
