package by.mgvrk.dao;

import by.mgvrk.entity.User;
import by.mgvrk.service.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User: sharitonchik
 */
public class DataUserDao {
    DBConnection dbConnection;

    public DataUserDao() {
        dbConnection = DBConnection.getInstance();
    }

    public void setDataUser(User user) throws SQLException {
        String sqlQueryString = "INSERT INTO DATA_USER VALUES (?,?,?,?)";
        PreparedStatement statement = dbConnection.getPreparedStatement(sqlQueryString);

        statement.setInt(1, user.getID());
        statement.setString(2, user.getCountry());
        statement.setString(3, user.getPhone());
        statement.setString(4, user.getEmail());

        statement.executeUpdate();
    }
}
