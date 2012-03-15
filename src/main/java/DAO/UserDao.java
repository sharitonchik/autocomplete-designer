package DAO;

import Entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * UserDao: sharitonchik
 */
public class UserDao {
    Connection connection;

    public UserDao() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
           System.err.print("Class not found");
        }
    }

    public boolean addUser(User user) {
        String sqlQueryString = "INSERT INTO USERS VALUES (?,?,?)";

        try {
            connection = DriverManager.getConnection("jdbc:hsqldb:mem:testdb", "SA", "");


            connection.setAutoCommit(false);

            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(sqlQueryString);

                statement.setInt(1, user.getID());
                statement.setString(2,user.getName());
                statement.setString(3,user.getPassword());

                statement.executeUpdate();
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
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    //ignore
                }
            }
        }
        return false;
    }
}
