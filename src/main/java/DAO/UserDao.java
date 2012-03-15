package DAO;

import Entity.User;

import java.beans.Statement;
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
//        try {
//            Class.forName("org.hsqldb.jdbc.JDBCDriver");
//        } catch (ClassNotFoundException e) {
//           System.err.print("Class not found");
//        }
    }

    public boolean addUser(User user) {
        String sqlQueryString = "update users set name=?, password=?";

        try {
            connection = DriverManager.getConnection("jdbc:hsqldb:mem:testdb", "SA", "");


            connection.setAutoCommit(false);

            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(sqlQueryString);

                statement.setString(1,user.getName());
                statement.setString(2,user.getPassword());

                statement.executeUpdate();
            } finally {
                if (statement != null) {
                    statement.close();
                }
            }

            connection.commit();

        } catch (Exception e) {
//            try {
//                connection.rollback();
//            } catch (SQLException e1) {
                e.printStackTrace(System.out);
//            }
        }
        return false;
    }
}
