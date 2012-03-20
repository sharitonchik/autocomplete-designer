package by.mgvrk.dao;

import by.mgvrk.entity.User;
import by.mgvrk.service.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * UserDao: sharitonchik
 */
public class UserDao {
    DBConnection dbConnection;

    public UserDao() {
        dbConnection = DBConnection.getInstance();
    }

    public void setUser(User user) throws SQLException {
        String sqlQueryString = "INSERT INTO USERS VALUES (?,?,?)";
        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);

        statement.setInt(1, user.getID());
        statement.setString(2, user.getName());
        statement.setString(3, user.getPassword());

        statement.executeUpdate();
    }
}
